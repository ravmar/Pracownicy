package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Zapis4 {
	// 
	public static void main(String[] args) {
		String sciezka = "C:/Users/kurs/Desktop/plik4.txt";
// konstrukcja try with resources - automatyczne zamykanie  zasobow
// nie trzeba jawnie wywolywac close
//close zostanie wywolane automatycznie
		try (PrintWriter out = new PrintWriter(sciezka)){
			out.println("Zapis do pliku");
			out.println("Data: " + LocalDate.now());
			out.println("Godzina: " + LocalTime.now());
			out.println("Pełna data: "+ZonedDateTime.now());
			
			
			 out.println("A teraz podzielę coś przez zero...");
	   		 out.println(LocalTime.now().getHour() / 0);
	   		 out.println("Próba napisania czegoś po błędzie");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
