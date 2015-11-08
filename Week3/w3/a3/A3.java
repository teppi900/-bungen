package a3;

import java.io.BufferedReader;
import java.io.FileReader;

public class A3 {
	public static void main(String[] args) {
		try{
		BufferedReader in =new BufferedReader(new FileReader("D:Kontostaende.txt"));
		
		while(in.ready()){
			try {
			String line=in.readLine();
			Character sc= new Character(',');
			Character sc2=new Character('.');
			line=line.replace(sc, sc2);
			double star=Double.parseDouble(line);
				for (int i = 0; i < star; i=i+10) {
					System.out.print("*");
				}
				System.out.print("\n");
				}catch(Exception e){
					System.out.println(e);
				}
		}
		in.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
