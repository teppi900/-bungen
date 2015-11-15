package a2;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Gebe Wort Nr.1 ein: ");					//word 1
		String s1=sc.nextLine();
		System.out.println("Gebe Wort Nr.2 ein: ");					//word 2
		String s2=sc.nextLine();
		sc.close();													//close sc
		try {
			if(s1.length()==0 && s2.length()==0 ){					//if both word length equals 0	
				System.out.println("**** parameter missed" ) ;
			}														//end of if
			else if(s1.length()==0 || s2.length()==0 ){				//if word 1 or word 2 has a length of 0
				
				System.out.println("**** one more parameter missed" );
			} 														//end of else if
			else{													
				System.out.println(s1+" "+s2);						
			}														//end of else
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}																//end of main()
}																	//end of A2
