package a4;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Zahl zwischen 1-6");
		int zahl=sc.nextInt();
		switch (zahl) {
		case 1:
			System.out.println("sehr gut");
			break;
		
		case 2:
			System.out.println("gut");
			break;
		
		case 3:
			System.out.println("befriedigend");
			break;
		
		case 4:
			System.out.println("ausreichend");
			break;
		
		case 5:
			System.out.println("mangelhaft");
			break;
			
		case 6:
			System.out.println("ungenügend");
			break;
			
		default:
			System.out.println("Geht nicht");
			break;
		}
	}
}
