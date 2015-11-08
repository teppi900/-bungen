package a2;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Gebe Wort Nr.1 ein: ");
		String s1=sc.nextLine();
		System.out.println("Gebe Wort Nr.2 ein: ");
		String s2=sc.nextLine();
		try {
			if(s1.length()==0 && s2.length()==0 ){
				System.out.println("****parameter missed" ) ;
			}
			else if(s1.length()==0 || s2.length()==0 ){
				
				System.out.println("**** one more parameter missed" );
			} 
			else{
				System.out.println(s1+" "+s2);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
