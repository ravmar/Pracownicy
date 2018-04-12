package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Zapis2 {
	// z powodu bledu (dzielenie przez 0) plik nie zapisze sie, nie wykona sie out.close()
	public static void main(String[] args) {

		try {
			PrintWriter out = new PrintWriter("C:/Users/kurs/Desktop/plik2.txt");
			out.println("Zapis do pliku");
			out.println("Data: " + LocalDate.now());
			out.println("Godzina: " + LocalTime.now());
			out.println("Pełna data: "+ZonedDateTime.now());
			
			
			 out.println("A teraz podzielę coś przez zero...");
	   		 out.println(LocalTime.now().getHour() / 0);
	   		 out.println("Próba napisania czegoś po błędzie");

			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
