package a5;

import java.util.Scanner;

public class A5 {
	public static void umRechnung(double euro) {
		double e=euro*1.19;
		double dollar=e*1.0971;
		System.out.println("Euro: "+e+" Dollar: "+dollar);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Euro: ");
		double euro=sc.nextDouble();
		umRechnung(euro);
	}
	
}
