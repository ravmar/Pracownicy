package pracownicy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestZapisu {

	public static void main(String[] args) {
		
		List<Pracownik> pracownicy = new ArrayList<>();
		pracownicy.add(new Pracownik(11, "Anna", "Kowalska", "sekretarka", LocalDate.now(), new BigDecimal(3000), "213-132-511", "biuro", "gdzies", "Warszawa"));
		pracownicy.add(new Pracownik(12, "Jan", "Kowalski", "kierowca", LocalDate.parse("2000-01-01"), new BigDecimal(2500), "219-131-515", "garaz", "gdzies", "Warszawa"));
		
		 ObslugaCSV.zapisz("test.csv", pracownicy);
	   	 System.out.println("Gotowe");
	}

}
