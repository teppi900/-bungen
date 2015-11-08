package a6;

import java.util.Scanner;

public class A6 {
	public static void zins(double kWert,double zSatz,int jahr){
		System.out.println("Jahr 0: "+kWert);
		for (int i = 0; i < jahr; i++) {
			double wert=kWert;
			wert=wert*(1+zSatz/100);
			kWert=wert;
			System.out.println("Jahr "+(i+1)+": "+kWert);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kapitalwert: ");
		double kWert=sc.nextDouble();
		System.out.println("Zinssatz(%):");
		double zinsSatz=sc.nextDouble();
		System.out.println("Laufzeit:");
		int jahr=sc.nextInt();
		zins(kWert,zinsSatz,jahr);
		
		
	}
}
