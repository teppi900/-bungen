package a1;

public abstract class Konto {
	protected double kontoStand;
	
	public Konto(double kontoStand){
		this.kontoStand=kontoStand;
	}
	public abstract String getDescribtion();
	public abstract void abheben();
	public abstract void einzahlen();
	public double getKontoStand() {
		return kontoStand;
	}
	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}
}
