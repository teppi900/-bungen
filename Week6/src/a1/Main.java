package a1;

public class Main {

	public static void main(String[] args) {												
		// TODO Auto-generated method stub
		String[] month={"Jan","Feb","Mrz","Mai","Jun","Jul","Aug","Sep","Okt","Nov","Dez"};
		Datum[]date={	new Datum(18,"Dez"),
								new Datum(13,"Jan"),
								new Datum(4,"Feb"),
								new Datum(23,"Aug"),
								new Datum(11,"Jul"),
					};
		Reise [] r1={	new Reise("Mallorca",date[0]),
						new Reise("Isis",date[1]),
						new Reise("Texas",date[1]),
						new Reise("Taliban",date[2]),
						new Reise("Berlin",date[3]),
						new Reise("Paris",date[4]),
						new Reise("Hong Kong",date[4])
					};
 
		Kunde[] kunde={ new Kunde("Phuc Dat","Bich",r1[3],date[1]),
						new Kunde("Fuk","Yu",r1[4],date[2]),
						new Kunde("Fuk","Mi",r1[1],date[1])
					};
		//i'm too lazy. In this exercise every month has 30 days and Dez is the last month. 
		int tempBuchungsDatum=0;
		int tempGebuchteReiseDatum=0;
		for (int i = 0; i < kunde.length; i++) {
			for (int j = 0; j < month.length; j++) {
				if(kunde[i].getBuchungsDatum().getMonat().equals(month[j])){
					tempBuchungsDatum=j;
				}
				if(kunde[i].getGebuchteReise().getDatum().getMonat().equals(month[j])){
					tempGebuchteReiseDatum=j;
				}
			}//end of for (int j = 0; j < month.length; j++)
		if (tempBuchungsDatum==tempGebuchteReiseDatum) {
			int temp=kunde[i].getGebuchteReise().getDatum().getTag()-kunde[i].getBuchungsDatum().getTag();
			if (temp<5&&temp>=0) {
				System.out.println("Mr/Mrs/Ms. "+kunde[i].getName()+", Reise muss mindestens 5 Tage vor Reisebeginn gebucht werden.");
			}//end of if (temp<5&&temp>=0) 
			else {
				System.out.println(kunde[i].getName()+" "+kunde[i].getVorName()+"\nBuchungsdatum: "+kunde[i].getBuchungsDatum().getTag()+" "+kunde[i].getBuchungsDatum().getMonat()+ "\nGebuchte Reise: "+kunde[i].getGebuchteReise().getZiel()+" am "+kunde[i].getGebuchteReise().getDatum().getTag()+" "+kunde[i].getGebuchteReise().getDatum().getMonat());
			}
		}//end of if (tempBuchungsDatum==tempGebuchteReiseDatum)
		else if (tempBuchungsDatum<tempGebuchteReiseDatum) {
			int temp1=tempGebuchteReiseDatum*30+kunde[i].getGebuchteReise().getDatum().getTag();
			int temp2=tempBuchungsDatum*30+kunde[i].getBuchungsDatum().getTag();
			int temp=temp1-temp2;
			if (temp>5) {
				System.out.println(kunde[i].getName()+" "+kunde[i].getVorName()+"\nBuchungsdatum: "+kunde[i].getBuchungsDatum().getTag()+" "+kunde[i].getBuchungsDatum().getMonat()+ "\nGebuchte Reise: "+kunde[i].getGebuchteReise().getZiel()+" am "+kunde[i].getGebuchteReise().getDatum().getTag()+" "+kunde[i].getGebuchteReise().getDatum().getMonat());
			}
			else {
				System.out.println("Mr/Mrs/Ms. "+kunde[i].getName()+", Reise muss mindestens 5 Tage vor Reisebeginn gebucht werden.");
			}
		}//end of else if
		else {
			System.out.println("Mr/Mrs/Ms. "+kunde[i].getName()+", Reise muss mindestens 5 Tage vor Reisebeginn gebucht werden.");
		}
			System.out.println("===============================================================================");
		}//end of for (int i = 0; i < kunde.length; i++)
	
		
	}

}
