package a3;

public class Kunde {
	private int id;
	private String name;
	private String mailAdr;
	
	public Kunde(int id,String name,String mailAdr){
		this.id=id;
		this.name=name;
		this.mailAdr=mailAdr;
		displayKunde(id, name, mailAdr);
	}
	public void displayKunde(int id,String name,String mailAdr){
		System.out.println(id+" "+mailAdr+" "+name);
	}
	public boolean isEqual(Kunde k1,Kunde k2){
		if (!k1.mailAdr.equals(k2.mailAdr)) {
			return false;
		}
		return true;
	}
	
}
