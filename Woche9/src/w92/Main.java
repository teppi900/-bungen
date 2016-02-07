package w92;

import w92.Einlagekonto.zeitRaum;

public class Main {
	public static void main(String[] args) {
		Kunde k1=new Kunde();
		k1.addKonto(new Einlagekonto("asdw",zeitRaum.Anlagezeitraum90));
//		System.out.println(k1.);
		System.out.println();
	}
}
