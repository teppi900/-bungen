package a6;

import java.util.Scanner;

public class A6 {
	public static void zins(double kWert,double zSatz,int jahr){			//zins()
		System.out.println("Jahr 0: "+kWert);
		for (int i = 0; i < jahr; i++) {									//for each year
			double wert=kWert;
			wert=wert*(1+zSatz/100);										
			kWert=wert;
			System.out.println("Jahr "+(i+1)+": "+kWert);					//print year and money
		}																	//end of for
	}																		//end of zins()
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);									
		System.out.println("Kapitalwert: ");
		double kWert=sc.nextDouble();
		System.out.println("Zinssatz(%):");
		double zinsSatz=sc.nextDouble();
		System.out.println("Laufzeit:");
		int jahr=sc.nextInt();
		sc.close();															//sc.close
		zins(kWert,zinsSatz,jahr);											//call zins() with kWert, zinsSatz and jahr as parameter
		
		
	}																		//end of main()
}																			//end of A6
