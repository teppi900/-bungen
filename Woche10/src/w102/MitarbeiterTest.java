package w102;

public class MitarbeiterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test Aufgabe 1 und 2
		MitarbeiterAktienPlan aktienPlan1=new MitarbeiterAktienPlan();
		Manager manager1=new Manager(207,"Barbara Janson","054-12-2367",109501.36,"IT Service US");
		Angestellte admin1=new Angestellte(304,"Bil Moserrrr","108-24-6409",75002.34);
		Angestellte admin2=new Angestellte(305,"Bill Moserrr","107-25-6509",7002.34);
		Angestellte admin3=new Angestellte(306,"Billl Moserr","106-26-6609",5002.34);
		Angestellte admin4=new Angestellte(307,"Billll Moser","105-27-6709",7500.34);
		Direktor direktor1=new Direktor(12,"Susanne Weiler"," 099-45-2340",120567.36,"Global Marketing",1000000.00);
		manager1.addMitarbeiter(admin1);
		manager1.addMitarbeiter(admin4);
		manager1.addMitarbeiter(admin3);
		manager1.addMitarbeiter(admin2);
		
		System.out.println(manager1.findMitarbeiter(admin3));
		
		manager1.displayStaff();
//		manager1.displayMitarbeiter();
//		admin1.displayMitarbeiter();
//		direktor1.displayMitarbeiter();
//		System.out.println("test "+direktor1.getAbtName()+", "+direktor1.getBudget());
//		direktor1.setName("Susanne Langweiler");
//		direktor1.displayMitarbeiter();
//		System.out.println(manager1.getAbtName());
//		manager1.raiseGehalt(3);
//		manager1.displayMitarbeiter();
//		//test Aufgabe 3
//		aktienPlan1.anzahlAktien(direktor1);
//		aktienPlan1.anzahlAktien(manager1);
//		aktienPlan1.anzahlAktien(admin1);
		
	}

}
