package celebiseyahatacentesibilettatilsistemi;

import java.util.Date;

public class Bilet {
private Firma firma;
private Date tarih;
private String kalkisNoktasi;
private String varisNoktasi;
private double fiyat;


public Bilet(Firma firma, Date tarih, String kalkisNoktasi, String varisNoktasi, double fiyat) {
	this.firma = firma;
	this.tarih = tarih;
	this.kalkisNoktasi = kalkisNoktasi;
	this.varisNoktasi = varisNoktasi;
	this.fiyat = fiyat;
	}
public Firma getFirma() {
	return firma;
}
public Date getTarih() {
	return tarih;
}
public String getkalkisNoktasi() {
	return kalkisNoktasi;
}
public String getvarisNoktasi() {
	return varisNoktasi;
}
public double getFiyat() {
	return fiyat;
	}
}

