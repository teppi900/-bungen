package a1;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Alter: ");								//ask for age
			int alter=sc.nextInt();
			sc.close();													//close sc
			if(alter<16){												//baby
				System.out.println("Geh nach Hause");
			}															//end of if
			 if(alter<=17){												//teenager
				 if (alter>=16){
					 System.out.println("Bier und Wein");
				 }														//end of if
			 }															//end of if
			 else{														//adult
				 System.out.println("Bier, Schnaps und Wein");
			 }
			 System.exit(0);
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}																	//end of main()
}																		//end of A1
