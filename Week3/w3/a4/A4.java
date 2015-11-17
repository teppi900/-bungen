package a4;
import java.util.Scanner;
public class A4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double max;
		double min;
		System.out.println("Wie viele Kontostände?");		// length of array
		int konto=sc.nextInt();
		double[]account=new double[konto];						
		double[]oldAccount;
		for (int j = 0; j <account.length; j++) {		// assign variable to the array
			System.out.println("Kontostand "+(j+1)+": ");		
			double z=sc.nextDouble();							
			account[j]=z;										
		}														
		oldAccount=account.clone();				// cloning account
		sc.close();
		double x;
		for (int j = 0; j < account.length-1; j++) {		//bubblesort
			if (account[j]>account[j+1]) {
				x=account[j];
				account[j]=account[j+1];
				account[j+1]=x;
			}
		}	
		min=account[0];						//calculation and stuff
		max=account[account.length-1];
		double sum=0;												
		for (int j = 0; j < account.length; j++) {
			sum=sum+account[j];
		}
		double mittel = sum/account.length;
		
		for (int j = 0; j < account.length; j++) {		//print account balance, min, max and the average value
			System.out.println("Kontostand: "+oldAccount[j]);	
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("mittel "+mittel);
		
	}

}
