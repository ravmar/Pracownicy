package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Zapis1 {

	public static void main(String[] args) {

		try {
			PrintWriter out = new PrintWriter("C:/Users/kurs/Desktop/plik1.txt");
			out.println("Zapis do pliku");
			out.println("Data: " + LocalDate.now());
			out.println("Godzina: " + LocalTime.now());
			out.println("Pełna data: "+ZonedDateTime.now());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
