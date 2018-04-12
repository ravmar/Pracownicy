package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt {

	public static void main(String[] args) {

		String sciezka = "C:/Users/kurs/Desktop/plik4.txt";
		
		File plik = new File(sciezka);
		try (Scanner sc = new Scanner(plik)) {
			
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				System.out.println(linia);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Nie ma pliku");
		}

	}

}
