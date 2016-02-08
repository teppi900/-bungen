package w10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
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
		//Hashset can't be sorted
		ArrayList<Integer>sorted=new ArrayList<Integer>(set);
		Collections.sort(sorted);
		System.out.println("Sorted");
		
		for (int zahl:sorted) {
			System.out.print(zahl+" ");
		}
		
	}
}
