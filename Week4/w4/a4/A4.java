package a4;
import java.util.Scanner;

public class A4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String userName="teppi";
		String user;
		String passWort;
		String decision;
		
		do {
				System.out.println("Username: ");
				user=sc.nextLine();
		} while (!user.equals(userName));
		do {
			do {
				System.out.println("Passwort (mindesten 8 char): ");
				passWort=sc.nextLine();
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				if (passWort.matches("[a-z]*")) {													//only lowerCase letters
					System.out.println("Level: *");
					System.out.println("Passwort: "+passWort);
				}																				//end of if (passWort.matches("[a-z]*"))
				
				else if(passWort.matches("(?=.*[A-Z].*[0-9]|.*[0-9].*[A-Z])(?!.*\\W)\\w.*")){		//at least 1 upperCase letter and 1 number. no special letters 
					System.out.println("Level: **");
					System.out.println("Passwort: "+passWort);
				}																				//end of else if(passWort.matches("(?=.*[A-Z].*[0-9]|.*[0-9].*[A-Z])(?!.*\\W)\\w.*"))
				
				else if(passWort.matches("^([A-Z]{1,})(.+\\W.+\\d|.+\\d.+\\W)\\w.*")){				//beginning of line must be an upperCase letter. At least 1 number and 1 special letter
					System.out.println("Level:"
							+ " ***");
					System.out.println("Passwort: "+passWort);
					System.out.println("Level: Max."+"\n"+"System shuts down");
					System.exit(0);
				}																				//end of else if(passWort.matches("^([A-Z]{1,})(.+\\W.+\\d|.+\\d.+\\W)\\w.*"))
				else {
					System.out.println("Nope");
					System.out.println(passWort);
				}																				//end of else
			} while (passWort.length()<8);														//end of do while(passWort.length()<8)
			
			
			System.out.println("Passwort ändern (Y)? ");
			decision=sc.nextLine();
		} while (decision.equals("y")||decision.equals("Y"));									//end of do while (decision.equals("y")||decision.equals("Y"))
			sc.close();
			System.out.println("Bye");
	}																							//end of main()

}																								//end of A4()
