package a3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class A3 {
	private static ArrayList<String>words=new ArrayList<String>();
	private static HashMap<String,Integer>map=new HashMap<String,Integer>();
	public static String[]lines;
	public static void einLesen(){
		try {
			BufferedReader in=new BufferedReader(new FileReader("D:Textpassage.txt"));
			while (in.ready()) {
				String line=in.readLine();																	//read lines
				//System.out.println(line);
				//lines=line.split("[^\\w\\däüöÄÜÖß]");														
				lines=line.split("[\\s]");																	//split lines at whitespace
				for (int i = 0; i < lines.length; i++) {													
					lines[i]=lines[i].toLowerCase();														//put words to lowerCase
					char[]temp=lines[i].toCharArray();														//String to char Array
					for (int j = 0; j < temp.length; j++) {												
						if (Character.isLetterOrDigit(temp[j])==false) {									//search for special characters
							char sonderZeichen=temp[j];														//save it to a char variable
							String zeichen=String.valueOf(sonderZeichen);									//special character to String
							words.add(zeichen);																//save the String to our ArrayList
							StringBuilder builder=new StringBuilder(lines[i]);									
							builder.deleteCharAt(j);														//delete the special character in String
							builder.trimToSize();															
							lines[i] = builder.toString();													//save the new String into our Array
						}																				//end of if (Character.isLetterOrDigit(temp[j])==false)
					}																					//end of for (int j = 0; j < temp.length; j++)
					words.add(lines[i]);																	
				}																						//end of for (int i = 0; i < lines.length; i++)
			}																							//end of while(in.ready())
			words.trimToSize();																				
			in.close();	
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}																								//end of catch(IOException ioe)
	}																									//end of einLesen()
	
	public static void sort(){																			
		Collections.sort(words);																		//sort ArrayList
		/*
		for (String counter:words) {
			System.out.println(counter);
		}
		*/
	}
	public static void hashMap(){															
		for (int i = 0; i < words.size()-1; i++) {					
			int amount=1;
			while(words.get(i).equals(words.get(i+1))) {
				words.remove(i+1);																			//remove recurring words
				amount++;																					//counter
			}																							//end of while(words.get(i).equals(words.get(i+1)))
			words.trimToSize();
			map.put(words.get(i), amount);																	//add
			//System.out.println(obj+"\t "+key);
		}																								//end of for(int i = 0; i < words.size()-1; i++)
	}																									//end of hashmap()
	
	public static int size(){																				//search for longest String
		int length=0;
		for (int i = 0; i < words.size(); i++) {
			
			if (words.get(i).length()>length) {																
				length=words.get(i).length();
			}																							//end of if(words.get(i).length()>length)
		}																								//end of for (int i = 0; i < words.size(); i++)
		//System.out.println(length);
		return length;
	}																									//end of size()
	public static void reSize(int size){																	//resize all String to the longest String
			for (int j = 0; j < words.size(); j++) {
				if (words.get(j).length()<size) {
					//int temp=size-words.get(j).length();
					//System.out.print(words.get(j).length()+"\t");
					StringBuilder builder=new StringBuilder(words.get(j));
					builder.setLength(size);
					String newString=new String(builder);
					words.set(j,newString);
					//System.out.print(words.get(j).length()+"\n");
				}																						//end of if (words.get(j).length()<size)
			}																							//end of for (int j = 0; j < words.size(); j++)
	}																									//end of reSize(int size)
	
	public static void histoGramm(){																		//print everything
		System.out.println("Anzahl"+"\t"+"Wort/Zahl/Zeichen"+"\t"+"Histogramm");
		for (int i = 0; i < map.size(); i++) {
			String key=words.get(i);
			int obj=map.get(key);
			System.out.print(obj+"\t "+key+"\t");
			for (int j = 0; j < obj; j++) {
				System.out.print("*");
			}																							//end of for (int j = 0; j < obj; j++) {
			System.out.print("\n");
		}																								//end of for (int i = 0; i < map.size(); i++)
	}																									//end of histoGramm()
	
	public static void main(String[] args) {																//call methods
		einLesen();
		sort();
		size();
		reSize(size());
		hashMap();
		histoGramm();
	}																									//end of main()
}																										//end of A3
