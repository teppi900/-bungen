package w10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String next = new String("y");
		ArrayList<Integer> list = new ArrayList<>();
		
			
		
		do {
			System.out.println("Nummer: ");
			int num=sc.nextInt();
			list.add(num);
			System.out.println("Weiter?(y)");
			next=sc.next();
		} while (next.equals("y"));
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}


}