package a1;

public class Einlagekonto{
	//part 1
	//Die Klasse Einlagekonto umfasst die folgenden Attribute beschreibung, kontoStd, anlageDatum und ablaufDatum. 
	//Sie verfügt weiter über die Methoden abheben(), einzahlen() und getBeschreibung(). 
	//Mit dieser Methode erhält man neben der Angabe des Fälligkeitsdatums noch den Text „Termineinlagekonto“ enthält.
	private String beschreibung,anlageDatum,ablaufDatum;
	private double kontoStand;
	
	public Einlagekonto(double kontoStand,String beschreibung,String anlageDatum,String ablaufDatum){
		this.kontoStand=kontoStand;
		this.beschreibung=beschreibung;
		this.ablaufDatum=ablaufDatum;
		this.anlageDatum=anlageDatum;
	}

	public void abheben(double abheben){
		kontoStand-=abheben;
	}

	public void einzahlen(double einzahlen){
		kontoStand+=einzahlen;
	}
	
	public void getBeschreibung(){
		System.out.println("Termineinlagekonto "+ablaufDatum);
	}
	public String getAnlageDatum() {
		return anlageDatum;
	}

	public void setAnlageDatum(String anlageDatum) {
		this.anlageDatum = anlageDatum;
	}

	public String getAblaufDatum() {
		return ablaufDatum;
	}

	public void setAblaufDatum(String ablaufDatum) {
		this.ablaufDatum = ablaufDatum;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
