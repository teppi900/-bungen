package w7;

public class Manager extends Mitarbeiter{
	private String abtName;
	
	
	public Manager(int mitarbld,String name,String sld, double gehalt,String abtName){
		super(mitarbld,name,sld,gehalt);
		this.abtName=abtName;
	}
	public String getAbtName(){
		
		return abtName;
	}
	//Aufgabe 2
	@Override
	public void displayMitarbeiter() {
		// TODO Auto-generated method stub
		super.displayMitarbeiter();
		System.out.println("Abteilungsname: "+this.abtName);
	}
	

}
