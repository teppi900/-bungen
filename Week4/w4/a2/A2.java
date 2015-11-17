package a2;
import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Wort: ");
		String wort=sc.nextLine();
		System.out.println("Verschiebung (n): ");
		int verschiebung=sc.nextInt();
		sc.close();									//sc.close()
		char[]wortArray=wort.toCharArray();						//char array
		int length=wortArray.length;
		char[]codiert=new char[length];							//array 2
		int test,rest,code;
		
		
		for (int i = 0; i < wortArray.length; i++) {
		
			if(Character.isLetter(wortArray[i])){
			//upperCase
				if(Character.isUpperCase(wortArray[i])){
				int asciiNr=Character.hashCode(wortArray[i]);
				System.out.println(asciiNr);
		
				test=asciiNr+verschiebung;					//value of the next char
				
				if(test<=90){							//if test smaller or equal 90 (Z) == assign test to code
					code=test;
				}							//end of if(test<=90)
				else{								//if test larger than 90 
					rest=test-90;						//calculate the difference between test and 'Z'
					while (rest+64>90) {					//while test+'A' still larger than 'Z'
						rest=(rest+64)-90;				//assign (old rest+'A')-'Z' to rest	
					}						//end of while (rest+65>Z90)
					code=64+rest;						//65-1 because calculation cant get 0 as result
				}							//end of else
				codiert[i]=(char)code;						//save char 
				
				}							//end of if(Character.isUpperCase(wortArray[i]))
			
																										
																									
			//lowerCase
			else{
				
				int asciiNr=Character.hashCode(wortArray[i]);
				System.out.println(asciiNr);
				
					
					test=asciiNr+verschiebung;
				
					if(test<=122){																				
						code=test;
					}						//end of if(test<=122)
					else{
						rest=(asciiNr+verschiebung)-122;
						while (rest+96>122) {
							rest=(rest+96)-122;
						}					//end of while (rest+97>122)
						code=96+rest;
					}						//end of else
					codiert[i]=(char)code;
					
					}						//end of else
																					
					
				}							//end of if(Character.isUpperCase(wortArray[i]))
			else {
				codiert[i]=wortArray[i];	
			}								//end of else
		}									//end of for (int i = 0; i < wortArray.length; i++)
							
		for (int i = 0; i < codiert.length; i++) {
			System.out.print(codiert[i]);						//print coded char array
		}									//end of for (int i = 0; i < codiert.length; i++)
		
	
	}										//end of main()
}											//end of class
