package a2;

public class Buch {
	private String titel,standNr,verfasser;
	public Buch(String titel,String standNr,String verfasser){
		this.titel=titel;
		this.standNr=standNr;
		this.verfasser=verfasser;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getStandNr() {
		return standNr;
	}
	public void setStandNr(String standNr) {
		this.standNr = standNr;
	}
	public String getVerfasser() {
		return verfasser;
	}
	public void setVerfasser(String verfasser) {
		this.verfasser = verfasser;
	}
	
}
