package a2;

public class BuchVerz {
	private Buch buch;
	private Datum rueckGabe;
	public BuchVerz(Buch buch,Datum rueckGabe){
		this.buch=buch;
		this.rueckGabe=rueckGabe;
	}
	public Buch getBuch() {
		return buch;
	}
	public void setBuch(Buch buch) {
		this.buch = buch;
	}
	public Datum getRueckGabe() {
		return rueckGabe;
	}
	public void setRueckGabe(Datum rueckGabe) {
		this.rueckGabe = rueckGabe;
	}
	
}
