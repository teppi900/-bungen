package a1;

import java.util.Scanner;

public class Girokonto extends Konto{
	//Erstellen Sie die Klasse Girokonto, die �ber das zus�tzliche Attribut dispoLimit verf�gt.
	//F�gen Sie die beiden Konstruktoren hinzu:

	//Girokonto (double kontoStd, double dispoLimit),
	//Girokonto(double kontoStd) mit dispoLimit inital gleich Wert 0 gesetzt.

	//�berschreiben Sie die geerbte abstrakte Methode getDescription(), indem Sie als Text �Girokonto� einf�gen.
	//�berschreiben Sie die ebenfalls geerbte abstrakte Methode abheben() durch die zus�tzliche �berpr�fung, ob dabei das �berziehungslimit nicht �berschritten wird.

	//Implementieren Sie ein Testprogramm, das f�r Kunden Termingeldkonten und Girokonten erstellt sowie die Methoden abheben() und einzahlen() nutzt.
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
