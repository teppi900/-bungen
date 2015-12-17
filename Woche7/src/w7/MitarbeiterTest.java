package w7;

public class MitarbeiterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test Aufgabe 1 und 2
		MitarbeiterAktienPlan aktienPlan1=new MitarbeiterAktienPlan();
		Engineer engineer1=new Engineer( 101,"Jane Schmidt","012-34-5678",120345.67);
		Manager manager1=new Manager(207,"Barbara Janson","054-12-2367",109501.36,"IT Service US");
		Admin admin1=new Admin(304,"Bill Moser","108-23-6509",75002.34);
		Direktor direktor1=new Direktor(12,"Susanne Weiler"," 099-45-2340",120567.36,"Global Marketing",1000000.00);
		engineer1.displayMitarbeiter();
		manager1.displayMitarbeiter();
		admin1.displayMitarbeiter();
		direktor1.displayMitarbeiter();
		System.out.println("test "+direktor1.getAbtName()+", "+direktor1.getBudget());
		direktor1.setName("Susanne Langweiler");
		direktor1.displayMitarbeiter();
		System.out.println(manager1.getAbtName());
		manager1.raiseGehalt(3);
		engineer1.raiseGehalt(11);
		manager1.displayMitarbeiter();
		//test Aufgabe 3
		aktienPlan1.anzahlAktien(engineer1);
		aktienPlan1.anzahlAktien(direktor1);
		aktienPlan1.anzahlAktien(manager1);
		aktienPlan1.anzahlAktien(admin1);
		
	}

}
