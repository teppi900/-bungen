package a3;


public class A3 {
public static void main(String[] args) {
		
		Auto1 a1=new Auto1(20000,500,8.6);											//make an Auto object
		Auto1 a2=new Auto1(25000,1240,5.4);											//make an Auto object	
		double verbrauch1=a1.getVerbrauch()*1.35*1250;								//consumption Auto1
		double verbrauch2=a2.getVerbrauch()*1.12*1250;								//consumption Auto2
		
		double preis1;
		preis1=a1.getWert()+a1.getSteuer()+verbrauch1;								//total cost Auto1
		
		double preis2;
		preis2=a2.getWert()+a2.getSteuer()+verbrauch2;								//total cost Auto2
		
		System.out.println("Auto1 kostet: "+preis1+"\n"+"Auto2 kostet: "+preis2);	//print Auto1 and Auto2
	}																				//end of main()
}																					//end of A3
