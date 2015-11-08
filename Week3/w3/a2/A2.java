package a2;


import java.io.BufferedReader;
import java.io.FileReader;

public class A2 {
	public static void main(String[] args) {
		try {	
			BufferedReader in=new BufferedReader(new FileReader("D:Kontostaende.txt"));
			while(in.ready()){
				try{
				String a=in.readLine();
				Character ch=new Character(',');
				Character ch2=new Character('.');
				a=a.replace( ch , ch2);
				double zahl=Double.parseDouble(a);
				if(zahl>1000.0){
					System.out.println(zahl);
				}
				}catch(NumberFormatException e){
					System.out.println(e);
				}
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

	}
}
