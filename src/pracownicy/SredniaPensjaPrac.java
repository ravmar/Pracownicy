package pracownicy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SredniaPensjaPrac {

    public static void main(String[] args) {
   	 // dla każdego stanowiska wylicza średnią pensję na tym stanowisku
   	 // tak jak GROUP BY w SQL
   	 
   	 List<Pracownik> pracownicy = ObslugaCSV.odczytaj("pracownicy.csv");
   	 
   	 Map<String, BigDecimal> sumy = new HashMap<>();
   	 Map<String, Integer> ilosci = new HashMap<>();

   	 for (Pracownik pracownik : pracownicy) {
   		 String stanowisko = pracownik.getStanowisko();
		if(sumy.containsKey(stanowisko)) {
   			 // takie stanowisko już występowało - będziemy sumować
   			 
   			 BigDecimal suma = sumy.get(stanowisko);
   			 suma = suma.add(pracownik.getPensja());    
   			 sumy.put(stanowisko, suma);
   			 
   			 Integer ilosc = ilosci.get(stanowisko);
   			 ilosc++;
   			 ilosci.put(stanowisko, ilosc);
   			 
   		 } else {
   			 // takiego stanowiska jeszcze nie było - dodajemy po raz pierwszy
   			 
   			 sumy.put(stanowisko, pracownik.getPensja());
   			 ilosci.put(stanowisko, 1);
   		 }
   	 }
   	 
   	 System.out.println("Ilości: " + ilosci);
   	 System.out.println("Sumy: " + sumy);
   	 System.out.println();
   	 
   	 for (String stanowisko : sumy.keySet()) {
   		 BigDecimal suma = sumy.get(stanowisko);
   		 Integer ilosc = ilosci.get(stanowisko);
   		 
   		 BigDecimal srednia = suma.divide(BigDecimal.valueOf(ilosc), 3, RoundingMode.HALF_UP);
   		 System.out.printf("%32s : %9s\n" , stanowisko, srednia);
   	 }
   	 
    }

}
