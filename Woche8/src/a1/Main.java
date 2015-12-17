package a1;

public class Main {
	/*Aufgabe 1
Part 1  (Kundenreport)

Sie sind mit einem Projekt betraut, in dessen Rahmen die Logik einer Bank zu implementieren ist.
Die Banksoftware unterstützt die Erstellung von Termineinlagekonten (Festgeldkonten).
Bei dieser Kontenart sind Abhebungen erst nach einem bestimmten Fälligkeitsdatum möglich.
Erstellen Sie dazu die beiden Klassen Kunde und Einlagekonto.

        Die Klasse Kunde umfasst die Attribute name, vorname, kundenNr, kundeSeit sowie die Methoden addKonto() und getKonto().
        Die Klasse Einlagekonto umfasst die folgenden Attribute beschreibung, kontoStd, anlageDatum und ablaufDatum. Sie verfügt weiter über die Methoden abheben(), einzahlen() und getBeschreibung(). Mit dieser Methode erhält man neben der Angabe des Fälligkeitsdatums noch den Text „Termineinlagekonto“ enthält.


Erstellen Sie ein Programm Kundenreport, das alle Kunden und ihre Konten in einem Bericht anzeigen. Aufbau in etwa so:

KUNDENREPORT
Kunde: Meier, Emil
              Termineinlagekonto1 Fälligkeitsdatum1 Anlagebetrag1
Kunde: Yildirm, Mustafa
              Termineinlagekonto1 Fälligkeitsdatum2 Anlagebetrag2
              Termineinlagekonto2 Fälligkeitsdatum3 Anlagebetrag3
    
Part 2	(Main)

Die bestehende SW soll dahingehend optimiert werden, dass auch Girokonten unterstützt werden.

Es bietet sich an, eine allgemeine Klasse Konto einzuführen. Versuchen Sie das selbständig.

Erstellen Sie die Klasse Girokonto, die über das zusätzliche Attribut dispoLimit verfügt.
Fügen Sie die beiden Konstruktoren hinzu:

Girokonto (double kontoStd, double dispoLimit),
Girokonto(double kontoStd) mit dispoLimit inital gleich Wert 0 gesetzt.

Überschreiben Sie die geerbte abstrakte Methode getDescription(), indem Sie als Text „Girokonto“ einfügen.
Überschreiben Sie die ebenfalls geerbte abstrakte Methode abheben() durch die zusätzliche Überprüfung, ob dabei das Überziehungslimit nicht überschritten wird.

Implementieren Sie ein Testprogramm, das für Kunden Termingeldkonten und Girokonten erstellt sowie die Methoden abheben() und einzahlen() nutzt.

Es soll sich mit Hilfe der Methode report() jederzeit ein Kundenreport mit folgendem Aufbau erzeugen lassen:

KUNDENREPORT
Kunde: Meier, Emil
             Termineinlagekonto1 Fälligkeitsdatum1 Anlagebetrag1
             Girokonto aktuellerStand
Kunde: Yildirm, Mustafa
             Termineinlagekonto1 Fälligkeitsdatum2 Anlagebetrag2
             Termineinlagekonto2 Fälligkeitsdatum3 Anlagebetrag3
             Girokonto aktuellerStand*/
	public static void report(Kunde k){
		
		System.out.println(k.getName()+", "+k.getVorname());
		for (int i = 0; i < k.geteKonto().length; i++) {
			if (k.geteKonto()[i]!=null) {
				System.out.println("\t"+"Termineinlager "+i+" "+k.geteKonto()[i].getAblaufDatum()+" "+k.geteKonto()[i].getKontoStand());
			}
			
		}
		try {
			System.out.println("\t"+k.getgK().getDescribtion()+" aktuellerStand: "+k.getgK().getKontoStand());
		} catch (Exception e) {
			System.out.println("\t"+"kein Girokonto");
		}
		
	
	
}
public static void main(String[] args) {
	Kunde k2=new Kunde("Bich", "Phuc Dat", "D1N6-D0N6-1", 2000);
	Kunde k1=new Kunde("Don", "Phuc Dat", "D1N6-D0N6-2", 2007);
	Kunde k3=new Kunde("Don", "Phuc Bich", "D1N6-D0N6-3", 2010);
	
	Einlagekonto eK1=new Einlagekonto(1000, "ehmm beatifull", "11.11.11", "14.02.15");
	Einlagekonto eK2=new Einlagekonto(2000, "adorable", "06.06.06","09.09.09" );
	Einlagekonto eK3=new Einlagekonto(1500, "ehm more beautifull", "12.12.12", "15.03.16");
	Einlagekonto eK4=new Einlagekonto(3000, "rich", "03.03.03", "06.06.06");
	Einlagekonto eK5=new Einlagekonto(10, "poor", "21.12.02", "24.03.06");
	Einlagekonto eK6=new Einlagekonto(500,"sad","10.10.10" , "13.01.14");
	
	Girokonto gK1=new Girokonto(-100,-1000);
	Girokonto gK2=new Girokonto(100);
	
	k1.addKonto(0,eK1);
	k1.addKonto(1,eK2);
	k1.addKonto(2,eK3);
	k1.addKonto(3,eK4);
	k2.addKonto(1,eK5);
	k2.addKonto(2,eK6);
	
	k1.addKonto(gK1);
	k2.addKonto(gK2);
	
	report(k1);
	report(k2);
	report(k3);
	
	k1.getgK().einzahlen();
	k1.getgK().abheben();
	k1.geteKonto()[0].abheben(1000);
	k1.geteKonto()[2].einzahlen(100);
	
	k2.getgK().einzahlen();
	k2.getgK().abheben();
	k2.geteKonto()[1].einzahlen(200);
	k2.geteKonto()[2].abheben(100);
	
	report(k1);
	report(k2);
	report(k3);
}

}
