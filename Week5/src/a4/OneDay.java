package a4;

public class OneDay {
	private int tag,jahr;
	private String monat;
	private String[] month={"Jan","Feb","Mrz","Mai","Jun","Jul","Aug","Sep","Okt","Nov","Dez"};
	
	public OneDay(int tag,String monat,int jahr){
		this.tag=tag;
		this.monat=monat;
		this.jahr=jahr;
		
		setDate(tag,monat,jahr);
		
	}
	public void setDate(int tag,String monat,int jahr){
			if (jahr>10000||jahr<1000) {
				System.out.println("Jahr passt nicht");
			}
			int zahlTemp=0;
			boolean temp=false;
			for (int j = 0; j < month.length; j++) {
				if (monat==month[j]) {
					temp=true;
					zahlTemp=j;
				}
				
			}
			if (temp==false) {
				System.out.println("Monat passt nicht");
			}
			
			if (zahlTemp%2==0) {
				if (tag>31||tag<1) {
						System.out.println("Tag muss zwischen 1 und 31 sein");
				}
			}
			else if(zahlTemp==1){
				if (tag>28||tag<1) {
						System.out.println("Tag muss zwischen 1 und 28 sein");
				}
			}
			else if (zahlTemp%2!=0){
				if (tag>30||tag<1) {
					System.out.println("Tag muss zwischen 1 und 30 sein");
				}
				
			}
			
			
	}
	public void displayDate(){
		System.out.println(tag+"."+monat+"."+jahr);
	}
}
