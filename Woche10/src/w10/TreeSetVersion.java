package w10;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetVersion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String next = new String("y");
		TreeSet<Integer>set=new TreeSet<Integer>();
		
			
		
		do {
			System.out.println("Nummer: ");
			int num=sc.nextInt();
			set.add(num);
			System.out.println("Weiter?(y)");
			next=sc.next();
		} while (next.equals("y"));
		for (int i:set) {
			System.out.println(i);
		}
		sc.close();
	}

}
