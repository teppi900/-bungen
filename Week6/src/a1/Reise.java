package a1;

public class Reise {
	private String ziel;
	private Datum datum;
	public Reise(String ziel,Datum datum){
		this.ziel=ziel;
		this.datum=datum;
	}
	public String getZiel() {
		return ziel;
	}
	public void setZiel(String ziel) {
		this.ziel = ziel;
	}
	public Datum getDatum() {
		return datum;
	}
	public void setDatum(Datum datum) {
		this.datum = datum;
	}
}
