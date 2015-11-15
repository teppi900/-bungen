package a5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class A5 {
	public static void main(String[] args) {
		try {
			BufferedReader in =new BufferedReader(new FileReader("D:Auftragsliste.csv"));
			ArrayList<String>list=new ArrayList<String>();
			ArrayList<Double>wert1=new ArrayList<Double>();
			ArrayList<Double>wert2=new ArrayList<Double>();
			String tempString="";
			ArrayList<Double>wert3=new ArrayList<Double>();
			while (in.ready()) {
				String temp=in.readLine();
				String[] temps=temp.split(";");
			//replace , to .
				for (int i = 0; i < temps.length; i++) {
					Character ch=',';
					Character ch2='.';
					temps[i]=temps[i].replace(ch, ch2);
					list.add(temps[i]);
				}
			}
			in.close();
			//set "EUR"
			for (int i = 0; i < list.size(); i++) {
				if ((i+1)%4==0) {
						if (i>4) {
							list.set(i, "EUR");	
						}
				}
			}
			try {
				//Volumen
				for (int i = 0; i < list.size()-1; i++) {
					double w1;
					if((i+1)%4==1){
						if (i+1>4) {
							w1=Double.parseDouble(list.get(i));
							wert1.add(w1);	
						}
					}
				}
				//Rabatt
				for (int i = 0; i < list.size(); i++) {
					double w2;
					if((i+1)%4==2){
						if (i+1>4) {
							w2=Double.parseDouble(list.get(i));
							wert2.add(w2);
						}	
					}
				}
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
			}
			//Netto to wert3
			for (int i = 0; i < wert1.size(); i++) {
				double ergebnis=wert1.get(i)*(1+wert2.get(i)/100);
				ergebnis=Math.round(ergebnis*100)/100.0;										//round off	
				wert3.add(i, ergebnis);
			}
			//Netto to list
			System.out.println(wert3.size());
			int counter=0;
			for (int j = 0; j < list.size(); j++) {
				if((j+1)%4==3){
					if (j+1>4) {
							tempString=String.valueOf(wert3.get(counter));
							list.set(j, tempString);
							counter++;
					}	
				}
			}
			//get length
			int length=0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).length()>length) {																
					length=list.get(i).length();
				}																												
			}
			//set length
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).length()<length) {
					StringBuilder builder=new StringBuilder(list.get(j));
					builder.setLength(length);
					String newString=new String(builder);
					list.set(j,newString);
					//System.out.print(words.get(j).length()+"\n");
				}																						
			}	
			
			//print
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+"; ");
				if ((i+1)%4==0) {
					System.out.print("\n");
						}
				}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
