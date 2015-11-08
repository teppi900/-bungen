package a4;
import java.util.Scanner;
public class A4 {
	public static void main(String[] args) {
		int[] i=new int[5];
		Scanner sc=new Scanner(System.in);
		int max;
		int min;
		
		
		for (int j = 0; j < i.length; j++) {
			System.out.println("Zahl "+(j+1)+": ");
			double z=sc.nextInt();
		}
		for (int j = 0; j < i.length-1; j++) {
			if (i[j]<i[j+1]) {
				min=i[j];
			}
			System.out.println(min);
		}	
			
		int mittel=(i[0]+i[1]+i[2]+i[3]+i[4]+i[5])/i.length;	
		
	}
}
