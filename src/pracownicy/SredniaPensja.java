package pracownicy;

import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;

public class SredniaPensja {

	public static void main(String[] args) {
		
		List<Pracownik> lista = ObslugaCSV.odczytaj("pracownicy.csv");
		
		double suma = 0;
		double sumaStanowiska = 0;
		int licznik = 0;
		String stanowisko = JOptionPane.showInputDialog("Podaj nazwę stanowiska");
//		BigDecimal suma = new BigDecimal(0);
		for (Pracownik pracownik : lista) {
			if (pracownik.getStanowisko().toLowerCase().equals(stanowisko.toLowerCase())) {
			sumaStanowiska += pracownik.getPensja().doubleValue();
//			suma = suma.add(pracownik.getPensja());
			licznik++;
			}
			suma += pracownik.getPensja().doubleValue();
			
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("Liczba pracownikow: "+ lista.size());
		System.out.println("Liczba pracownikow na stanowisku "+ stanowisko + ": "+ licznik);
//		System.out.println("Srednia: " + suma.divide(new BigDecimal(lista.size())));
		System.out.println("Srednia dla wszystkich " + suma/lista.size());
		System.out.println("Srednia dla " + stanowisko + " " + sumaStanowiska/licznik);
	}

}
