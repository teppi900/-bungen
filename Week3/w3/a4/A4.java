package a4;
import java.util.Scanner;
public class A4 {
	public static void main(String[] args) {
		boolean swapped;
		Scanner sc=new Scanner(System.in);
		double max;
		double min;
		System.out.println("Wie viele Kontostände?");			// length of array
		int konto=sc.nextInt();
		double[]account=new double[konto];						
		double[]oldAccount;
		for (int j = 0; j <account.length; j++) {				// assign variable to the array
			System.out.println("Kontostand "+(j+1)+": ");		
			double z=sc.nextDouble();							
			account[j]=z;										
		}														
		oldAccount=account.clone();								// cloning account
		sc.close();
		double temp;
		do {													//bubble
			int n=account.length;
			swapped=false;
			for (int i = 0; i < n-1; i++) {
				if (account[i]>account[i+1]) {
					temp=account[i];
					account[i]=account[i+1];
					account[i+1]=temp;
					swapped=true;
				}												//end of if (account[i]>account[i+1])
			}													//end of for (int i = 0; i < n-1; i++) 
			n=n-1;
		} while (swapped=true);									//end of do while(swapped=true)
		min=account[0];											//calculation and stuff
		max=account[account.length-1];
		double sum=0;												
		for (int j = 0; j < account.length; j++) {
			sum=sum+account[j];
		}
		double mittel = sum/account.length;
		
		for (int j = 0; j < account.length; j++) {				//print account balance, min, max and the average value
			System.out.println("Kontostand: "+oldAccount[j]);	
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("mittel "+mittel);
		
	}

}
