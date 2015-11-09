package a3;

public class Auto1 {
	private int wert;
	private int steuer;
	private double verbrauch;
	public Auto1(int wert,int steuer,double verbrauch){								//Konstruktor
		this.wert=wert;
		this.steuer=steuer;
		this.verbrauch=verbrauch;
	}
	//setters and getters															!!!
	public int getWert() {
		return wert;
	}
	public void setWert(int wert) {
		this.wert = wert;
	}
	public int getSteuer() {
		return steuer;
	}
	public void setSteuer(int steuer) {
		this.steuer = steuer;
	}
	public double getVerbrauch() {
		return verbrauch;
	}
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}
}
