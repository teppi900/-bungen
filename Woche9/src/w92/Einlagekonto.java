package w92;
/**
 * 
 * @author kid
 *
 */
public class Einlagekonto {
	enum zeitRaum {Anlagezeitraum90, Anlagezeitraum180}
	private String beschreibung,kontoStand,anlageDatum,fälligDatum;

	public Einlagekonto(String kontoStand, zeitRaum z){
		this.kontoStand=kontoStand;
		zeitRaum a = z;
	}
	
	public void abheben(){
		
	}
	public void einzahlen(){
		
	}
	public String getBeschreibung(){
		System.out.println(fälligDatum+"TermineinlageKonto");
		return "";
	}
	
}
