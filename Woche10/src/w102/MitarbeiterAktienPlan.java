package w102;

public class MitarbeiterAktienPlan {
	//Aufgabe 3
	public void anzahlAktien(Mitarbeiter m){
		if(m instanceof Direktor ){
			System.out.println("Direktor Anzahl Aktien: 1000");
		}
		else if(m instanceof Manager){
			System.out.println("Manager Anzahl Aktien: 100");
		}
		else {
			System.out.println("Alle anderen Anzahl Aktien: 10");
		}
	}
}
