package a4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Wie viele Bücher?");
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		Datum d1=new Datum(0," ");
		Buch[]b=new Buch[temp];
		BuchVerz[]bv=new BuchVerz[temp];
		for (int i = 0; i < b.length; i++) {
			b[i]=new Buch(" "," "," ");
			bv[i]=new BuchVerz(b[i],d1);
		}
		int r=0;
		String next=" ";
		do {
			System.out.println("===========================================");
			System.out.println("Bibliothek XYZ");
			System.out.println("1. Buch hinzufügen");
			System.out.println("2. Buch suchen");
			System.out.println("3. Buch ausleihen");
			System.out.println("4. Bucher ausgeben");
			System.out.println("5. Anzahl von Bucher");
			System.out.println("6. Close");
			r=sc.nextInt();
			
			switch (r) {
			case 1:
				int counter=0;
				for (int i = 0; i < b.length; i++) {
					if (b[i].getTitel().equals(" ")&&b[i].getStandNr().equals(" ")&&b[i].getVerfasser().equals(" ")) {
						System.out.println("Titel: ");
						String random=sc.next();
						for (int j = 0; j < b.length; j++) {
							if(b[j].getTitel().equals(random)){
								counter++;
							}//end of if(b[i].getTitel().equals(titel))	
						}//end of for (int j = 0; j < b.length; j++) 
						if (counter==3) {
							System.out.println("Gibts schon 3 mal");
							System.out.println("Geht nicht");
							break;
						}//end of if (counter==3)*/
						b[i].setTitel(random);
						System.out.println("Verfasser: ");
						String verfasser=sc.next();
						b[i].setVerfasser(verfasser);
						
						System.out.println("StandNr: ");
						String stand=sc.next();
						b[i].setStandNr(stand);
						break;
					}
				}
				
				break;
			
			case 2:
				System.out.println("Titel: ");
				String titel=sc.next();
				for (int i = 0; i < b.length; i++) {
					if (titel.equals(b[i].getTitel())) {
						System.out.println(b[i].getStandNr());
					}else {
						System.out.println("Gibts nicht");
					}
				}
				break;
				
			case 3:
				System.out.println("Welches Buch möchtest du ausleihen? ");
				for (int i = 0; i < b.length; i++) {
					if (!b[i].getTitel().equals(" ")&&!b[i].getStandNr().equals(" ")&&!b[i].getVerfasser().equals(" ")){
					System.out.print(i+1+" "+b[i].getTitel()+", "+b[i].getStandNr()+", "+b[i].getVerfasser());
					if (bv[i].getRueckGabe().getMonat().length()!=0) {
						System.out.print(", "+bv[i].getRueckGabe().getTag()+"."+bv[i].getRueckGabe().getMonat()+"\n");
					}else {
						System.out.print("\n");
					}
					}
				}
				System.out.println("Gebe Position als id ein: ");
				int nextInt=sc.nextInt();
				int counter3=0;
				for (int j = 0; j < b.length; j++) {
					if(b[nextInt-1].getTitel().equals(b[j].getTitel())){
						counter3++;
					}//end of if(b[i].getTitel().equals(titel))	
				}//end of for (int j = 0; j < b.length; j++) 
				if (counter3==1) {
					System.out.println("Geht nicht");
					break;
				}//end of if (counter==3)*/
				System.out.println("Rueckgabemonat: ");
				String monat=sc.next();
				System.out.println("Rueckgabetag");
				int tag=sc.nextInt();
				Datum date=new Datum(tag,monat);
				bv[nextInt].setRueckGabe(date);
				
				break;
				
			case 4:
				for (int i = 0; i < b.length; i++) {
					System.out.print(i+1+" "+b[i].getTitel()+", "+b[i].getStandNr()+", "+b[i].getVerfasser());
					if (bv[i].getRueckGabe().getMonat().length()>1) {
						System.out.print(" verliehen\n");
					}else {
						System.out.println(" ");
					}
				}
				
				break;
			case 5:
				int counter2=0;
				for (int i = 0; i < b.length; i++) {
					if (!b[i].getTitel().equals(" ")&&!b[i].getStandNr().equals(" ")&&!b[i].getVerfasser().equals(" ")) {
						counter2++;
					}
				}
				System.out.println("Anzahl: "+counter2);
				break;

			case 6:
				sc.close();
				System.exit(0);
				break;

			default:
				break;
			}
		System.out.println("Weiter 'y' Sonst irgendein Taste ");
		next=sc.next();
		} while (next.equals("y"));
	}
}
