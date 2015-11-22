package m2;

import java.util.Scanner;

public class StringToInt {
	public static int quersumme(String s){
		
			char[] number=s.toCharArray();
			int quersum=0;
			for (int j = 0; j < number.length; j++) {
				if (!Character.isDigit(number[j])) {
					return -1;
					}
				else {
					int temp=Character.getNumericValue(number[j]);
					quersum=quersum+temp;
				}
			}
			return quersum;
	}
	public static void main(String[] args) {
		//part 1
		for (int i = 0; i < args.length; i++) {
			String s=args[i];
			System.out.println(i+1+" "+quersumme(s));
		}
		//part 2
		System.out.println("Part 1 erledigt");
		System.out.println("*************************************************");
		System.out.println("Part 2");
		System.out.println("Zahl: ");
		Scanner sc=new Scanner(System.in);
			String random=sc.nextLine();
			System.out.println(random+" "+quersumme(random));
		sc.close();
		System.exit(0);
		
	}

}
