package oopTekrar;

public class Trendyol extends Platform {
	private int urunFiyati;

	public Trendyol(String name, String urunAdi, String sipari��li, int urunAdedi,int urunFiyat�) {
		super(name, urunAdi, sipari��li, urunAdedi);
		this.urunFiyati=urunFiyat�;
		
	}

	public int getUrunFiyati() {
		return urunFiyati;
	}

	public void setUrunFiyati(int urunFiyati) {
		this.urunFiyati = urunFiyati;
	}
	public String toString() {
		String str;
		str= "Sat�� Platformu:" + this.name;
		str= "Sat�lan �r�n ad�:" + this.urunAdi;
		str = "Sipari� adedi: " + this.urunAdedi;
		str = "Sipari� ili: " + this.sipari��li;
		str = "Toplam �r�n tutar�: " +(this.urunAdedi *this.urunFiyati);
		return str;
	}

}
