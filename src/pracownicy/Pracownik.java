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
	
	public Pracownik () {
		
	}
	
	public Pracownik(int id, String imie, String nazwisko, String stanowisko, LocalDate data, int pensja,
			String telefon, String departament, String adres, String miasto) {
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adres == null) ? 0 : adres.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((departament == null) ? 0 : departament.hashCode());
		result = prime * result + id;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((miasto == null) ? 0 : miasto.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + pensja;
		result = prime * result + ((stanowisko == null) ? 0 : stanowisko.hashCode());
		result = prime * result + ((telefon == null) ? 0 : telefon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pracownik other = (Pracownik) obj;
		if (adres == null) {
			if (other.adres != null)
				return false;
		} else if (!adres.equals(other.adres))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (departament == null) {
			if (other.departament != null)
				return false;
		} else if (!departament.equals(other.departament))
			return false;
		if (id != other.id)
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (miasto == null) {
			if (other.miasto != null)
				return false;
		} else if (!miasto.equals(other.miasto))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (pensja != other.pensja)
			return false;
		if (stanowisko == null) {
			if (other.stanowisko != null)
				return false;
		} else if (!stanowisko.equals(other.stanowisko))
			return false;
		if (telefon == null) {
			if (other.telefon != null)
				return false;
		} else if (!telefon.equals(other.telefon))
			return false;
		return true;
	}
	
	
	
	
	

}
