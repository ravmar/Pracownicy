package pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {
	
	public static List<Pracownik> odczytaj(String sciezka){
		List<Pracownik> lista = new ArrayList<>(); 
		
		File plik = new File(sciezka);
		try(Scanner sc = new Scanner(plik)) {
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				System.out.println(linia);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return lista;		
	}

}
