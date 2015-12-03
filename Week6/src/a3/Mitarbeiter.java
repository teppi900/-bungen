package a3;

public class Mitarbeiter {
	private String name,vorname;
	private int persNr;
	public Mitarbeiter(String name, String vorname, int persNr){
		this.name=name;
		this.vorname=vorname;
		this.persNr=persNr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getPersNr() {
		return persNr;
	}
	public void setPersNr(int persNr) {
		this.persNr = persNr;
	}
	
}
