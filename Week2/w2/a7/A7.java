package a7;

public class A7 {
public static void leistung(double wert,int steuer,double benzin,double verbrauch,int leistung){	//leistung()
		
		
		for (int i = 0; i < 6; i++) {																//6 years
			double gVerbrauch=benzin*(verbrauch/100)*leistung;										//fuel cost for each year
			double w=wert;																			
			double gesamt=w+steuer+gVerbrauch;														//full cost for each year
			wert=gesamt;																			
			
			System.out.println("Jahr "+(i+1)+": "+gesamt);
		}																							//end of for
		System.out.println("===========================================");
		
	}																								//end of leistung
	
	
	public static void main(String[] args) {
		double a1=25000;										//went full retarded
		int s1=125;
		double b1=8.6;
		
		double a2=28500;
		int s2=310;
		double b2=6.4;
		
		double v1=1.31;
		double v2=1.12;
		
		int l1=17000;
		int l2=25000;
		leistung(a1,s1,v1,b1,l1);								//leistung car 1
		leistung(a2,s2,v2,b2,l2);								//leistung car 2
	}
}
