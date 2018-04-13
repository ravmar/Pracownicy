package pracownicy;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class GrupowanieFunkcyjne {

    public static void main(String[] args) {
   	 List<Pracownik> pracownicy = ObslugaCSV.odczytaj("pracownicy.csv");
   	 
   	 double srednia =
   		 pracownicy.stream()
   			 .map(p -> p.getPensja())
   			 .mapToDouble(BigDecimal::doubleValue)
   			 .average()
   			 .getAsDouble();
   	 
   	 System.out.println(srednia);
   	 
   	 DoubleSummaryStatistics statystyki = pracownicy.stream()
   		 .map(p -> p.getPensja())
   		 .mapToDouble(BigDecimal::doubleValue)
   		 .summaryStatistics();

   	 System.out.println("Statysyki: " + statystyki);

    }

}



