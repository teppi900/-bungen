package m3;

import java.util.Scanner;

public class Uebung3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Wert 1");
		String s1=sc.nextLine();
		System.out.println("Wert 2");
		String s2=sc.nextLine();
		boolean temp=true;
		
		do {
				System.out.println("***********************************");
				if ((s1.length()!=1 && s2.length()!=1)) {
					System.out.println("Wert 1 und 2 muessen min/max 1 Zeichen lang sein ");
					System.out.println("Wert 1");
					s1=sc.nextLine();
					System.out.println("Wert 2");
					s2=sc.nextLine();
				}
				else if (s1.length()!=1 && s2.length()==1) {
					System.out.println("Wert 1 muss min/max 1 Zeichen lang sein ");
					System.out.println("Wert 1");
					s1=sc.nextLine();
				}
				else if (s1.length()==1 && s2.length()!=1 ) {
					System.out.println("Wert 2 muss min/max 1 Zeichen lang sein ");
					System.out.println("Wert 2");
					s2=sc.nextLine();
				}
				else {
					temp=false;
				}
																	
			
			
		} while (temp==true);
		sc.close();
		char ch=s1.charAt(0);
		char ch2=s2.charAt(0);
		System.out.println(ch+", "+Character.hashCode(ch));
		System.out.println(ch2+", "+Character.hashCode(ch2));
	}
}
