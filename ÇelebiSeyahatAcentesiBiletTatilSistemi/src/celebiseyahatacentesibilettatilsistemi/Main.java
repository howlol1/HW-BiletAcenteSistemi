package celebiseyahatacentesibilettatilsistemi;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		CelebiSeyahatAcentesi seyahatAcentesi=new CelebiSeyahatAcentesi();
		
		seyahatAcentesi.setBiletPuanOrani(Firma.Ucan_Turk_Ozel_Havayolu, 0.01);
		seyahatAcentesi.setBiletPuanOrani(Firma.TCDD, 0.01);
		seyahatAcentesi.setBiletPuanOrani(Firma.YTUR, 0.01);
		
		seyahatAcentesi.setTatilPuanOrani("İstanbul",0.02);
		seyahatAcentesi.setTatilPuanOrani("Amasya",0.02);
		seyahatAcentesi.setTatilPuanOrani("İzmir",0.02);
		
		Musteri musteri=new Musteri("Yunus ŞAHİN");
		
		Bilet bilet=seyahatAcentesi.biletSatinAl(musteri, Firma.Ucan_Turk_Ozel_Havayolu,new Date(),"İstanbul","Amasya", 100.0, OdemeYontemi.Kredi_Karti);
		
		System.out.println("Bilet satın alındı: ");
		System.out.println("Firma: "+bilet.getFirma());
		System.out.println("Tarih: "+bilet.getTarih());
		System.out.println("Kalkış Noktası: "+bilet.getkalkisNoktasi());
		System.out.println("Varış Noktası: "+bilet.getvarisNoktasi());
		System.out.println("Fiyat: "+bilet.getFiyat());
		System.out.println();
		
		Tatil tatil=seyahatAcentesi.tatilSatinAl(musteri,"Amasya", new Date(),50.0, 7, OdemeYontemi.Nakit);
		
		System.out.println("Tatil satın alındı: ");
		System.out.println("Bölge: "+tatil.getBölge());
		System.out.println("Tarih: "+tatil.getTarih());
		System.out.println("Günlük fiyat: "+tatil.getgunlukFiyat());
		System.out.println();
		
		seyahatAcentesi.puanlariKullan(musteri,Firma.Ucan_Turk_Ozel_Havayolu,10.0);
		
		System.out.println(musteri.getIsim()+" adlı müşterinin "+Firma.Ucan_Turk_Ozel_Havayolu+" için kalan puanları " + musteri.getPuanlar(Firma.Ucan_Turk_Ozel_Havayolu));
		
	}
}
