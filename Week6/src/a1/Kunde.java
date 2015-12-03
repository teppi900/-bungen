package a1;

public class Kunde {
	private String name;
	private String vorName;
	private Reise gebuchteReise;
	private Datum buchungsDatum;
	public Kunde(String name,String vorName,Reise gebuchteReise,Datum buchungsDatum){
		this.name=name;
		this.vorName=vorName;
		this.gebuchteReise=gebuchteReise;
		this.buchungsDatum=buchungsDatum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorName() {
		return vorName;
	}
	public void setVorName(String vorName) {
		this.vorName = vorName;
	}
	public Reise getGebuchteReise() {
		return gebuchteReise;
	}
	public void setGebuchteReise(Reise gebuchteReise) {
		this.gebuchteReise = gebuchteReise;
	}
	public Datum getBuchungsDatum() {
		return buchungsDatum;
	}
	public void setBuchungsDatum(Datum buchungsDatum) {
		this.buchungsDatum = buchungsDatum;
	}
}
