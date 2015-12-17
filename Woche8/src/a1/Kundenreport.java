package a1;

public class Kundenreport {
	//part 1
	public static void print(Kunde k){
		
			System.out.println(k.getName()+", "+k.getVorname());
			for (int i = 0; i < k.geteKonto().length; i++) {
				if (k.geteKonto()[i]!=null) {
					System.out.println("\t"+"Termineinlager "+i+" "+k.geteKonto()[i].getAblaufDatum()+" "+k.geteKonto()[i].getAnlageDatum());
				}
				
			}
			
		
		
	}
	public static void main(String[] args) {
		Kunde k2=new Kunde("Bich", "Phuc Dat", "D1N6-D0N6-1", 2000);
		Kunde k1=new Kunde("Don", "Phuc Dat", "D1N6-D0N6-2", 2007);
		Einlagekonto eK1=new Einlagekonto(1000, "ehmm beatifull", "11.11.11", "14.02.15");
		Einlagekonto eK2=new Einlagekonto(2000, "adorable", "06.06.06","09.09.09" );
		Einlagekonto eK3=new Einlagekonto(1500, "ehm more beautifull", "12.12.12", "15.03.16");
		Einlagekonto eK4=new Einlagekonto(3000, "rich", "03.03.03", "06.06.06");
		Einlagekonto eK5=new Einlagekonto(0, "poor", "21.12.02", "24.03.06");
		Einlagekonto eK6=new Einlagekonto(-500,"sad","10.10.10" , "13.01.14");

		k1.addKonto(0,eK1);
		k1.addKonto(1,eK2);
		k1.addKonto(2,eK3);
		k1.addKonto(3,eK4);
		k2.addKonto(1,eK5);
		k2.addKonto(2,eK6);
		
		print(k1);
		print(k2);
		
	}

}
