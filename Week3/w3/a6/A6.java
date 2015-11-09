package a6;

import java.util.Scanner;

public class A6 {
	public static void main(String[] args) {						//main	
		int[]party={15,20,25,30};			
		Scanner sc=new Scanner(System.in);
		System.out.println("Jahre: ");
		int jahre=sc.nextInt();
		sc.close();													//close sc
		switch (jahre) {											//switch
		case 0:
			System.out.println("Arbeite");
			break;
			
		case 1:
			System.out.println(party[0]);
			break;
		
		case 2:
			System.out.println(party[1]);
			break;

		case 3:
			System.out.println(party[1]);
			break;
		
		case 4:
			System.out.println(party[2]);
			break;

		case 5:
			System.out.println(party[2]);
			break;
			
		default:
			System.out.println(party[3]);
			break;
		}															//end of switch	
			
	}																//end of main()
}																	//end of A5
