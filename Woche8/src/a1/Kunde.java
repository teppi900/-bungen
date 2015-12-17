package a1;

public class Kunde {
	//part 1
	//Die Klasse Kunde umfasst die Attribute name, vorname, kundenNr, kundeSeit sowie die Methoden addKonto() und getKonto().
	private String name, vorname, kundenNr;
	private int kundenSeit;
	private Einlagekonto[] eKonto=new Einlagekonto[10];
	private Girokonto gK;
	
	public Kunde(String name,String vorname,String kundenNr,int kundenSeit){
		this.name=name;
		this.vorname=vorname;
		this.kundenNr=kundenNr;
		this.kundenSeit=kundenSeit;
	}
	//part 1
	public void addKonto(int position,Einlagekonto ek){
		if (position>eKonto.length||position<0) {
			System.out.println("geht nicht");
		}
		else {
			eKonto[position]=ek;
		}
	}
	//part 2
	public void addKonto(Girokonto gK){
		this.gK=gK;
	}

	public Girokonto getgK() {
		return gK;
	}
	public void setgK(Girokonto gK) {
		this.gK = gK;
	}
	public void report(){
		System.out.println();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getKundenNr() {
		return kundenNr;
	}
	public void setKundenNr(String kundenNr) {
		this.kundenNr = kundenNr;
	}
	public int getKundenSeit() {
		return kundenSeit;
	}
	public void setKundenSeit(int kundenSeit) {
		this.kundenSeit = kundenSeit;
	}
	public Einlagekonto[] geteKonto() {
		return eKonto;
	}
	public void seteKonto(Einlagekonto[] eKonto) {
		this.eKonto = eKonto;
	}
}
