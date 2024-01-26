package celebiseyahatacentesibilettatilsistemi;

import java.util.Map;
import java.util.HashMap;
import java.util.Date;
public class CelebiSeyahatAcentesi {
	private Map <Firma,Double> biletPuanOranlari=new HashMap<> ();
	private Map <String,Double> tatilPuanOranlari=new HashMap<> ();
	
	public void setBiletPuanOrani(Firma firma,double oran) {
		biletPuanOranlari.put(firma,oran);
	}
	public void setTatilPuanOrani(String bölge,double oran) {
		tatilPuanOranlari.put(bölge,oran);
	}
	public Bilet biletSatinAl(Musteri musteri,Firma firma,Date tarih,String kalkisNoktasi,String varisNoktasi,double fiyat,OdemeYontemi odemeYontemi) {
		Bilet bilet=new Bilet(firma,tarih,kalkisNoktasi,varisNoktasi,fiyat);
		if(odemeYontemi==OdemeYontemi.Nakit) {
			double puanlar=bilet.getFiyat()*biletPuanOranlari.get(firma);
			musteri.puanEkle(firma,puanlar);
		}
		return bilet;
	}
	
	public Tatil tatilSatinAl(Musteri musteri,String bölge,Date tarih,double gunlukFiyat,int gunSayisi,OdemeYontemi odemeYontemi) {
		Tatil tatil=new Tatil(bölge,tarih,gunlukFiyat);
		double toplamFiyat=tatil.getgunlukFiyat()*gunSayisi;
		if(odemeYontemi==OdemeYontemi.Nakit) {
			double puanlar=toplamFiyat*tatilPuanOranlari.get(bölge);
			musteri.puanEkle(Firma.Ucan_Turk_Ozel_Havayolu,puanlar);
		}
		return tatil;
	}
	public void puanlariKullan(Musteri musteri,Firma firma,double puanlar) {
		musteri.puanlariKullan(firma, puanlar);
	}

}
