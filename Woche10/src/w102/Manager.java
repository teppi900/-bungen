package w102;

import java.util.ArrayList;

/**
 * 
 * @author kid
 *
 */
public class Manager extends Mitarbeiter{
	private String abtName;
	private ArrayList<Angestellte> staff=new ArrayList<>();
	private int mitarbeiterCount=0;
	
	
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
	
	public int findMitarbeiter(Angestellte temp){
		if (mitarbeiterCount!=0) {
			for (int i = 0; i < staff.size(); i++) {
				if (staff.get(i)==temp) {
					return i;
				}
			}
		}
		
		return -1;
	}
	public void addMitarbeiter(Angestellte temp){
		staff.add(temp);
		mitarbeiterCount++;
	}
	public void removeMitarbeiter(Angestellte temp){
		staff.remove(temp);
		mitarbeiterCount--;
	}
	public void displayStaff(){
		System.out.println("Manager: "+name);
		for (int i = 0; i < staff.size(); i++) {
			System.out.printf("ID: %d\t%s\r",i,staff.get(i).getName());
		}
		
	}
}
