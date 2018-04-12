package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis1 {

	public static void main(String[] args) {

		try {
			PrintWriter out = new PrintWriter("C:/Users/kurs/Desktop/plik1.txt");
			out.println("Zapis do pliku");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
