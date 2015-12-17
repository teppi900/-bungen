package w7;

public class Direktor extends Manager {
	private double budget;
	public Direktor(int mitarbld,String name,String sld, double gehalt,String abtName,double budget){
		super(mitarbld, name, sld, gehalt, abtName);
		this.budget=budget;
	}
	public Double getBudget(){
		return budget;
	}
	//Aufgabe 2
	@Override
	public void displayMitarbeiter() {
		// TODO Auto-generated method stub
		super.displayMitarbeiter();
		System.out.println("Budget: "+this.budget);
	}
	
}
