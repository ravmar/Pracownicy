package pracownicy;

import java.math.BigDecimal;
import java.util.List;

public class Podwyzka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wejscie = "pracownicy.csv";
		String wyjscie = "podwyzka.csv";
		BigDecimal zmiana = new BigDecimal("500.00");
		
		
		List<Pracownik> lista = ObslugaCSV.odczytaj(wejscie);
		
		for (Pracownik pracownik : lista) {
			if (pracownik.getStanowisko().equals("Programmer")) {
				pracownik.setPensja(pracownik.getPensja().add(zmiana));
			}
		}
		
		ObslugaCSV.zapisz(wyjscie, lista);
		

	}

}
