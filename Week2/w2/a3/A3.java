package a3;

import java.util.Scanner;

public class A3 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Zugehörigkeit: ");							//scan
		int time=sc.nextInt();
		sc.close();														//close sc
		switch (time) {								
		case 0:
			System.out.println("Arbeite");
			break;
			
		case 1:
			System.out.println("15 Tage");
			break;
		
		case 2:
			System.out.println("20 Tage");
			break;

		case 3:
			System.out.println("20 Tage");
			break;
		
		case 4:
			System.out.println("25 Tage");
			break;

		case 5:
			System.out.println("25 Tage");
			break;
			
		default:
			System.out.println("30 Tage");
			break;
		}																//end of switch
	}																	//end of main()
}																		//end of A3
