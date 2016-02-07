package w103;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		
		HashMap<String, String>en2de= new HashMap<>();
		HashMap<String, String>de2en=new HashMap<>();
		en2de.put("yes", "ja");
		en2de.put("king", "könig");
		en2de.put("troll", "trollen");
		en2de.put("cock", "hahn");
		en2de.put("cock", "schwanz");
		en2de.put("love", "liebe");
		en2de.put("no", "nein");
		en2de.put("google", "googlen");
		en2de.put("fire", "feuer");
		en2de.put("what", "was");
		
		de2en.put("ja", "nein");
		de2en.put("könig", "king");
		de2en.put("trollen", "troll");
		de2en.put("hahn", "cock");
		de2en.put("schwanz", "cock");
		de2en.put("liebe", "love");
		de2en.put("nein", "no");
		de2en.put("googlen", "google");
		de2en.put("feuer", "fire");
		de2en.put("was", "what");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Englisch-Deutsch(e) oder Deutsch-Englisch(d)");
		String next=sc.next();
		if(next.equals("e")){
			for (String e:en2de.keySet()) {
				String a=en2de.get(e);
				System.out.printf(" %s -  %s\r",e,a );
			}
			System.out.println("Wort:");
			String temp=sc.next();
			
			System.out.println(en2de.get(temp));
			
		}
		else if (next.equals("d")) {
			for (String d:de2en.keySet()) {
				String a=de2en.get(d);
				System.out.printf(" %s -  %s\r",d,a );
			}
			System.out.println("Wort:");
			String temp=sc.next();
			
			System.out.println(de2en.get(temp));
			
		}else {
			System.out.println("falsche Eingabe");
		}
		
		
		
	}
}