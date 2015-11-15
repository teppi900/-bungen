package a3;

import java.io.BufferedReader;
import java.io.FileReader;

public class A3 {
	public static void main(String[] args) {
		try{
		BufferedReader in =new BufferedReader(new FileReader("D:Kontostaende.txt"));	//BufferedReader
		
		while(in.ready()){																//while buffer not empty==true
			try {
			String line=in.readLine();													//readLine
			Character sc= new Character(',');
			Character sc2=new Character('.');
			line=line.replace(sc, sc2);													//convert "," to "."
			double star=Double.parseDouble(line);										//convert String to double
				for (int i = 0; i < star; i=i+10) {										//draw stars
					System.out.print("*");
				}																		//end of for
				System.out.print("\n");
				}catch(Exception e){
					System.out.println(e);
				}
		}																				//end of while
		in.close();																		//close BufferedReader
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}																					//end of main()
}																						//end of A3
