package a5;

import java.util.Scanner;

public class A5 {
	
	private static double []account;
	private static double []oldAccount;
	private static double max;
	private static double min;
	private static Scanner sc=new Scanner(System.in);
	
		public static void start(){						//start method
			System.out.println("Wie viele Kontost�nde?");			//amount of accounts
			int konto=sc.nextInt();
			account=new double[konto];
			for (int j = 0; j <account.length; j++) {			//assign variable to array
				System.out.println("Kontostand "+(j+1)+": ");
				double z=sc.nextDouble();
				account[j]=z;												
				oldAccount=account.clone();				//clone account
				}						//end of for
		}								//end of start()
		
		public static void rechner(){						//rechner method									
			min=account[0];							//min	
			max=account[account.length-1];					//max
			double sum=0;											
			for (int j = 0; j < account.length; j++) {
				sum=sum+account[j];
			}
			double mittel = sum/account.length;				//sum
			
			for (int j = 0; j < account.length; j++) {			//print
				System.out.println("Kontostand: "+oldAccount[j]);
			}
			System.out.println("min: "+min);
			System.out.println("max: "+max);
			System.out.println("mittel "+mittel);
		}								//end of rechner()
		
		public static void bubble(){						//bubble method
			boolean swapped;
			double temp;
			int n = account.length;
					  do{
					    swapped = false;
					    for (int i=0; i<n-1; ++i){
					      if (account[i] > account[i+1]){
					        temp=account[i];
					        account[i]=account[i+1];
					        account[i+1]=temp;
					        swapped = true;
					      } // ende if
					    } // ende for
					    n = n-1;
					  } while (swapped == true);
					  for (int i = 0; i < account.length; i++) {
						System.out.println(account[i]);
					}
		}
		public static void main(String[] args) {				//main()
			try {
				start();
				bubble();
				rechner();
			} catch (Exception e) {
				System.out.println(e);
			}															
		
		
		
		}																//end of main()

}																		//end of A5
