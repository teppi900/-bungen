package a1;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Part 1:");
		
		for (int i = 0; i < 128; i++) {											//ASCII 
			System.out.print((i)+": "+(char)i+", ");
		}
		System.out.println("");
		System.out.println("==============================================================");
		System.out.println("Part 2:");			
		for (int i = 0; i <128; i++) {
			Character ch=(char)i;
			if (Character.isUpperCase(ch)&&Character.isLetter(ch)) {			// Gross und Buchstabe
				System.out.println(ch.hashCode()+": "+ch);						// Value + char
			}
			
				
			}
		
	}

}
