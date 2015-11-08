package a5;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kabel: ");
		double kabel=sc.nextDouble();
		System.out.println("Time: ");
		int time=sc.nextInt();
		double all=(kabel*2+50*time);
		System.out.println(all);
		String i="y";
		while(i.equals("y")){
		System.out.println("noch was? y oder n");
		i=sc.next();
		if(i.equals("y")){
			System.out.println("Wie viel?");
			double extra=sc.nextDouble();
			all=all+extra;
			System.out.println(all);	
		}else{
			System.out.println("Bye");
			System.exit(0);
		}
	}
	}
}
