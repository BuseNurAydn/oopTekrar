package oopTekrar;

public class Trendyol extends Platform {
	private int urunFiyati;

	public Trendyol(String name, String urunAdi, String siparişİli, int urunAdedi,int urunFiyatı) {
		super(name, urunAdi, siparişİli, urunAdedi);
		this.urunFiyati=urunFiyatı;
		
	}

	public int getUrunFiyati() {
		return urunFiyati;
	}

	public void setUrunFiyati(int urunFiyati) {
		this.urunFiyati = urunFiyati;
	}
	public String toString() {
		String str;
		str= "Satış Platformu:" + this.name;
		str= "Satılan ürün adı:" + this.urunAdi;
		str = "Sipariş adedi: " + this.urunAdedi;
		str = "Sipariş ili: " + this.siparişİli;
		str = "Toplam ürün tutarı: " +(this.urunAdedi *this.urunFiyati);
		return str;
	}

}
