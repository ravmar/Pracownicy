package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Zapis3 {

	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			out = new PrintWriter("C:/Users/kurs/Desktop/plik3.txt");
			out.println("Zapis do pliku");
			out.println("Data: " + LocalDate.now());
			out.println("Godzina: " + LocalTime.now());
			out.println("Pełna data: "+ZonedDateTime.now());
			
			
			 out.println("A teraz podzielę coś przez zero...");
	   		 out.println(LocalTime.now().getHour() / 0);
	   		 out.println("Próba napisania czegoś po błędzie");

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(out!=null) {
			out.close();
			
			}
		}

	}

}
