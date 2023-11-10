package oopTekrar;

public class Platform {
   protected String name,urunAdi,siparişİli;
   protected int urunAdedi;
   
   public Platform(String name,String urunAdi,String siparişİli,int urunAdedi) {
	   this.name=name;
	   this.urunAdi=urunAdi;
	   this.siparişİli=siparişİli;
	   this.urunAdedi=urunAdedi;
	   
	   
   }
   public String toString() {
	String str;
	str = "Satış platformu :" + this.name;
	str = "Satılan Ürün :" + this.urunAdi;
	str = "Sipariş adedi :" + this.urunAdedi;
	str = "Sipariş ili :" + this.siparişİli;
	
	return str;
	   
   }
}
