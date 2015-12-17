package w7;

public abstract class Mitarbeiter {
	protected int mitArbLd;
	protected String name;
	protected String sld;
	protected double gehalt;
	
	public Mitarbeiter(int mitarbld,String name,String sld, double gehalt){
		this.mitArbLd=mitarbld;
		this.name=name;
		this.sld=sld;
		this.gehalt=gehalt;
	}
	public void setName(String name){
		//Aufgabe 2
		if (name!=null) {
			this.name=name;
		}
		
	}
	public void raiseGehalt(double erhoehung){
		//Aufgabge 2
		if(erhoehung<=10 && erhoehung>0){
			double temp=gehalt;
			gehalt=gehalt*(1+(erhoehung/100));
			System.out.println("Davor: "+temp+" Danach: "+gehalt);
		}
		else {
			System.out.println("Geht nicht");
		}
		
	}
	public void displayMitarbeiter(){
		System.out.println("Name: "+name+"\n"+"mitArbLd: "+mitArbLd+"\n"+"Sld: "+sld+"\n"+"Gehalt: "+gehalt);
	}
}
