package celebiseyahatacentesibilettatilsistemi;
import java.util.HashMap;
import java.util.Map;
public class Musteri {
	private String isim;
	private Map <Firma,Double> puanlar = new HashMap<>();
	
	public Musteri(String isim) {
		this.isim=isim;
	}
	public String getIsim() {
		return isim;
	}
	public void puanEkle(Firma firma,double puanlar){
		if(!this.puanlar.containsKey(firma)) {
			this.puanlar.put(firma,0.0);
		}
		this.puanlar.put(firma,this.puanlar.get(firma)+puanlar);
	}
	public double getPuanlar(Firma firma) {
		if(!this.puanlar.containsKey(firma)) {
			return 0.0;
		}
		return this.puanlar.get(firma);
	}
	public void puanlariKullan(Firma firma,double puanlar) {
		if(!this.puanlar.containsKey(firma)) {
			return;
		}
		if (this.puanlar.get(firma)<puanlar) {
			return;
		}
		this.puanlar.put(firma,this.puanlar.get(firma)-puanlar);
	}

}
