package w10;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetVersion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String next = new String("y");
		HashSet<Integer> set = new HashSet<Integer>();
		
			
		
		do {
			System.out.println("Nummer: ");
			int num=sc.nextInt();
			set.add(num);
			System.out.println("Weiter?(y)");
			next=sc.next();
		} while (next.equals("y"));
		
		for (int zahl:set) {
			System.out.println(zahl);
		}
		sc.close();
	}
}
