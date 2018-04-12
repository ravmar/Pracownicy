package pracownicy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pracownik {
	
	private int id;
	private String imie;
	private String nazwisko;
	private String stanowisko;
	private LocalDate data;
	private int pensja;
	private String telefon;
	private String departament;
	private String adres;
	private String miasto;
	
	private Pracownik(int id, String imie, String nazwisko, String stanowisko, LocalDate data, int pensja,
			String telefon, String departament, String adres, String miasto) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.stanowisko = stanowisko;
		this.data = data;
		this.pensja = pensja;
		this.telefon = telefon;
		this.departament = departament;
		this.adres = adres;
		this.miasto = miasto;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getImie() {
		return imie;
	}



	public void setImie(String imie) {
		this.imie = imie;
	}



	public String getNazwisko() {
		return nazwisko;
	}



	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}



	public String getStanowisko() {
		return stanowisko;
	}



	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}



	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}



	public int getPensja() {
		return pensja;
	}



	public void setPensja(int pensja) {
		this.pensja = pensja;
	}



	public String getTelefon() {
		return telefon;
	}



	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}



	public String getDepartament() {
		return departament;
	}



	public void setDepartament(String departament) {
		this.departament = departament;
	}



	public String getAdres() {
		return adres;
	}



	public void setAdres(String adres) {
		this.adres = adres;
	}



	public String getMiasto() {
		return miasto;
	}



	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}



	@Override
	public String toString() {
		return "Pracownik [id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", stanowisko=" + stanowisko
				+ ", data=" + data + ", pensja=" + pensja + ", telefon=" + telefon + ", departament=" + departament
				+ ", adres=" + adres + ", miasto=" + miasto + "]";
	}
	
	
	
	
	

}
