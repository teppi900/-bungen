package a1;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]konto=new double[5];
		for (int i = 0; i < konto.length; i++) {						
			System.out.println("Kontostand "+(i+1)+": ");				//ask for account balance
			double k=sc.nextDouble();
			konto[i]=k;													
		}																//end of for
		sc.close();														//close sc
		for (int i = 0; i < konto.length; i++) {						
			System.out.println(konto[i]);								//print all konto
		}																//end of for
		System.out.println(konto[2]);									//print konto[2]
	}																	//end of main		
}																		//end of A1
