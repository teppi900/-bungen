package a3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mitarbeiter[]m=new Mitarbeiter[5];
		
		Mitarbeiter[]n=new Mitarbeiter[5];
		Mitarbeiter m1=new Mitarbeiter("Bich","Phuc Dat",2);
		Mitarbeiter m2=new Mitarbeiter("Bich","Dat",12);
		Mitarbeiter m3=new Mitarbeiter("Bi","Phuc Dat",22);
		Mitarbeiter m4=new Mitarbeiter("Bich","Phuc",23);
		Mitarbeiter m5=new Mitarbeiter("Bich","Troll ",42);
		Mitarbeiter m6=new Mitarbeiter("Peanut","Phuc Dat",432);
		Mitarbeiter m7=new Mitarbeiter("Bich","Phuc Wat",256);

		
		m[0]=m1;
		m[1]=m2;
		m[2]=m3;
		m[3]=m4;
		m[4]=m5;
		
		n[0]=m6;
		n[1]=m7;
		Abteilung a1=new Abteilung("Andy","Trolls",1);
		Abteilung a2=new Abteilung("Boby","Nerds",12.1,m);
		Abteilung a3=new Abteilung("DingDong","Ragers",1,n);
		a2.print();
		
		Abteilung[]a={a1,a2,a3};
		for (int i = 0; i < a.length; i++) {
			try {
				a[i].print();
			} catch (Exception e) {
				if (i+1<a.length) {
					a[i+1].print();	
				}else {
					break;
				}
				
			}
				
			
	}

	}
}
