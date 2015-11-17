package a2;


import java.io.BufferedReader;
import java.io.FileReader;

public class A2 {
	public static void main(String[] args) {
		try {	
			BufferedReader in=new BufferedReader(new FileReader("D:Kontostaende.txt"));		//BufferedReader
			while(in.ready()){																//while buffer not empty==true
				try{
				String a=in.readLine();														//readLine
				Character ch=new Character(',');	
				Character ch2=new Character('.');
				a=a.replace( ch , ch2);														//convert "," to "."
				double zahl=Double.parseDouble(a);											//convert String to double
				if(zahl>100.0){																//print numbers over 1000.0
					System.out.println(zahl);
				}																		//end of if
				}catch(NumberFormatException e){
					e.printStackTrace();
				}
			}																			//end of while
			in.close();																		//close BufferedReader
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

	}																					//end of main()
}																						//end of A2
