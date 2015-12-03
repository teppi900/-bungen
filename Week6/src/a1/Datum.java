package a1;

public class Datum {
	private int tag;
	private String monat;
	public Datum(int tag,String monat){
		this.tag=tag;
		this.monat=monat;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public String getMonat() {
		return monat;
	}
	public void setMonat(String monat) {
		this.monat = monat;
	}
}
