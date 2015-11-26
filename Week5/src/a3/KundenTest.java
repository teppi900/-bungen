package a3;

public class KundenTest {
	public static void main(String[] args) {
		Kunde kunde1=new Kunde(1,"Baba","asdfe@fefeaw.ef");
		Kunde kunde2=new Kunde(3,"Bea","asdfe@eaw.ef");
		System.out.println(kunde1.isEqual(kunde1, kunde2));
		kunde2=kunde1;
		System.out.println(kunde1.isEqual(kunde1, kunde2));
	}
}
