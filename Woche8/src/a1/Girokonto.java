package a1;

import java.util.Scanner;

public class Girokonto extends Konto{
	//Erstellen Sie die Klasse Girokonto, die über das zusätzliche Attribut dispoLimit verfügt.
	//Fügen Sie die beiden Konstruktoren hinzu:

	//Girokonto (double kontoStd, double dispoLimit),
	//Girokonto(double kontoStd) mit dispoLimit inital gleich Wert 0 gesetzt.

	//Überschreiben Sie die geerbte abstrakte Methode getDescription(), indem Sie als Text „Girokonto“ einfügen.
	//Überschreiben Sie die ebenfalls geerbte abstrakte Methode abheben() durch die zusätzliche Überprüfung, ob dabei das Überziehungslimit nicht überschritten wird.

	//Implementieren Sie ein Testprogramm, das für Kunden Termingeldkonten und Girokonten erstellt sowie die Methoden abheben() und einzahlen() nutzt.
	private double dispoLimit=0;
	private Scanner sc;
	public Girokonto (double kontoStd, double dispoLimit){
		super(kontoStd);
		this.dispoLimit=dispoLimit;
	}
	public Girokonto(double kontoStd){
		super(kontoStd);
	}
	@Override
	public String getDescribtion() {
		// TODO Auto-generated method stub
		return "Girokonto";
	}
	@Override
	public void abheben(){
		System.out.println("Abheben: ");
		sc=new Scanner(System.in);
		
		double abheben=0;
		try {
			abheben=sc.nextDouble();
			System.out.println("Betrag="+abheben);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Betrag="+abheben);
		}
		
		double temp=kontoStand-abheben;
		if(temp<dispoLimit){
			System.out.println("Dispolimit ueberschritten!");
		}else {
			kontoStand=temp;
			
		}
		
	}
	@Override
	public void einzahlen() {
		// TODO Auto-generated method stub
		System.out.println("Einzahlen: ");
		sc=new Scanner(System.in);
		
		double einzahlen=0;
		try {
			einzahlen=sc.nextDouble();
			System.out.println("Betrag="+einzahlen);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Betrag="+einzahlen);
		}
		
		kontoStand=kontoStand+einzahlen;
	}
	
	
}
