package a1;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Alter: ");
			int alter=sc.nextInt();
			if(alter<16){
				System.out.println("Geh nach Hause");
			}
			 if(alter<=17){
				 if (alter>=16){
					 System.out.println("Bier und Wein");
				 }
			 }
			 else{
				 System.out.println("Bier, Schnaps und Wein");
			 }
			 System.exit(0);
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
