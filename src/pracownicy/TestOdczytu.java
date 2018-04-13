package pracownicy;

import java.util.List;

public class TestOdczytu {

	public static void main(String[] args) {
		
		System.out.println("poczatek czytania");
		List<Pracownik> lista = ObslugaCSV.odczytaj("pracownicy.csv");
		
		System.out.println("wczytano " + lista.size() + " pracowników");
		for (Pracownik pracownik : lista) {
			System.out.println(pracownik);
		}
		System.out.println("koniec");
		
	}

}
