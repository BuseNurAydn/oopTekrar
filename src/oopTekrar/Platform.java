package oopTekrar;

public class Platform {
   protected String name,urunAdi,sipari��li;
   protected int urunAdedi;
   
   public Platform(String name,String urunAdi,String sipari��li,int urunAdedi) {
	   this.name=name;
	   this.urunAdi=urunAdi;
	   this.sipari��li=sipari��li;
	   this.urunAdedi=urunAdedi;
	   
	   
   }
   public String toString() {
	String str;
	str = "Sat�� platformu :" + this.name;
	str = "Sat�lan �r�n :" + this.urunAdi;
	str = "Sipari� adedi :" + this.urunAdedi;
	str = "Sipari� ili :" + this.sipari��li;
	
	return str;
	   
   }
}
