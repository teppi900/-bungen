package a1;

public class Shirt {
	private int hemdID;
	private String beschreibung;
	private char farbCode;
	private double preis;
	private int mengeAufLager;
	
	public Shirt(int hemdID,String beschreibung,char farbCode,double preis,int mengeAufLager) {			
		// TODO Auto-generated constructor stub
		this.hemdID=hemdID;
		this.beschreibung=beschreibung;
		this.farbCode=farbCode;
		this.preis=preis;
		this.mengeAufLager=mengeAufLager;
	}
	public void displayInformation(){
		switch (farbCode) {
		case 'b':
			System.out.println(hemdID+" "+beschreibung+" blau "+preis+" "+mengeAufLager);
			break;
		case 'r':
			System.out.println(hemdID+" "+beschreibung+" rot "+preis+" "+mengeAufLager);
			break;
		case 'g':
			System.out.println(hemdID+" "+beschreibung+" gelb "+preis+" "+mengeAufLager);
			break;
		default:
			System.out.println(hemdID+" "+beschreibung+" "+farbCode+" "+preis+" "+mengeAufLager);
			break;
		}
		
	}
}
