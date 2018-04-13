package pracownicy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SredniaPensjaPerStanowisko {

	public static void main(String[] args) {
		// wyliczenie sredniej pensji dla wszystkich stanowisk

		List<Pracownik> pracownicy = ObslugaCSV.odczytaj("pracownicy.csv");
		Map<String, BigDecimal> pensje = new HashMap<>();
		
		//lista stanowisk
		Set<String> stanowiska = new TreeSet<>();
		for (Pracownik pracownik : pracownicy) {
			stanowiska.add(pracownik.getStanowisko());
		}
		
		//liczenie sum/sredniej wg listy stanowisk
		for (String stanowisko : stanowiska) {
			BigDecimal suma = new BigDecimal(0);
			int licznik = 0; 
			for (Pracownik pracownik : pracownicy) {
				if (pracownik.getStanowisko().equals(stanowisko)) {
					suma = suma.add(pracownik.getPensja());
					licznik++;
					
				}
//				pensje.put(stanowisko, new BigDecimal(licznik));
//				pensje.put(stanowisko, suma.divide(new BigDecimal(licznik),2,RoundingMode.HALF_UP));			
				
			}	
			pensje.put(stanowisko, suma.divide(BigDecimal.valueOf(licznik),3,RoundingMode.HALF_UP));
		}
		System.out.println(stanowiska);
		System.out.println(pensje);
		
	
		
		
		
	}

}
