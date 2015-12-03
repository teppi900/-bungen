package a3;

import java.util.Arrays;

public class Abteilung {
	private String bezeichnung,nameLtr;
	private double budget;
	private Mitarbeiter[]m={new Mitarbeiter("","",0),
							new Mitarbeiter("","",0),
							new Mitarbeiter("","",0),
							new Mitarbeiter("","",0),
							new Mitarbeiter("","",0)
							};
	

	public Abteilung(String nameLtr,String bezeichnung,double budget){
		this.nameLtr=nameLtr;
		this.bezeichnung=bezeichnung;
		this.budget=budget;
	}
	public Abteilung(String nameLtr,String bezeichnung,double budget,Mitarbeiter[] mitarbeiter){
		this.nameLtr=nameLtr;
		this.bezeichnung=bezeichnung;
		this.budget=budget;
		this.m=mitarbeiter;
	}
	public void print(){
		System.out.println("nameLtr: "+nameLtr+", bezeichnung: "+bezeichnung+", budget: "+budget+", ");
		for (int i = 0; i < m.length; i++) {
			System.out.print("Mitarbeiter: "+(i+1)+" "+m[i].getName()+", "+m[i].getVorname()+"; "+m[i].getPersNr());
			System.out.println(" ");
		}
		
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getNameLtr() {
		return nameLtr;
	}
	public void setNameLtr(String nameLtr) {
		this.nameLtr = nameLtr;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Mitarbeiter[] getM() {
		return m;
	}
	public void setM(Mitarbeiter[] m) {
		this.m = m;
	}
	
	
}
