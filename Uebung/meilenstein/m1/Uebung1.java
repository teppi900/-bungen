package m1;

public class Uebung1 {
	public static void main(String[] args) {
		int summen=0;
		for (int i = 0; i < args.length; i++) {
			System.out.println("Zahl "+args[i]+":");
			int numb=Integer.parseInt(args[i]);
			for (int j = 1; j < 11; j++) {
				int rechnung=j*numb;
				summen=summen+rechnung;
				System.out.print(rechnung+", ");
			}
			System.out.println("");
			System.out.println("Summe: "+summen);
			System.out.println("********************************************************************");
		}
	}
}
