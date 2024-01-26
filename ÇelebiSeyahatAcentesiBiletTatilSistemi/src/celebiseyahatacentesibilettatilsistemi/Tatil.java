package celebiseyahatacentesibilettatilsistemi;

import java.util.Date;

public class Tatil {
private String bölge;
private Date tarih;
private double gunlukFiyat;

public Tatil(String bölge, Date tarih, double gunlukFiyat) {
	this.bölge = bölge;
	this.tarih = tarih;
	this.gunlukFiyat = gunlukFiyat;
	}

public String getBölge() {
	return bölge;
}
public Date getTarih() {
	return tarih;
}
public double getgunlukFiyat() {
	return gunlukFiyat;
	}
}

