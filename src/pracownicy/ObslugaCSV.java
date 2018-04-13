package pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {
	
	private static final String SEPARATOR = ";";

	public static List<Pracownik> odczytaj(String sciezka){
		List<Pracownik> lista = new ArrayList<>(); 
		
		File plik = new File(sciezka);
		try(Scanner sc = new Scanner(plik)) {
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				String[] pola = linia.split(SEPARATOR);
				
				int id = Integer.parseInt(pola[0]);
				LocalDate data = LocalDate.parse(pola[4]);
				BigDecimal pensja = new BigDecimal(pola[5]);
				
				Pracownik pracownik = new Pracownik(id, pola[1], pola[2], pola[3], data, pensja, pola[6], pola[7], pola[8], pola[9]);
				lista.add(pracownik);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	public static void zapisz(String sciezka, List<Pracownik> pracownicy) {
		 try(PrintWriter out = new PrintWriter(sciezka)) {
			 
			 for (Pracownik pracownik : pracownicy) {
				out.println(pracownik.getId()+SEPARATOR+pracownik.getImie()+SEPARATOR+pracownik.getNazwisko()+SEPARATOR+pracownik.getStanowisko()
							+SEPARATOR+pracownik.getData()+SEPARATOR+pracownik.getImie()+SEPARATOR+pracownik.getPensja()+SEPARATOR+pracownik.getTelefon()
							+SEPARATOR+pracownik.getDepartament()+SEPARATOR+pracownik.getDepartament()+SEPARATOR+pracownik.getAdres()+SEPARATOR+pracownik.getMiasto());
			}
	   		 
	   	 } catch (FileNotFoundException e) {
	   		 e.printStackTrace();
	   	 }

	}

}
