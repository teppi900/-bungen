package w9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		String date="11.5.2004";
		System.out.println(date);
	
		DateTimeFormatter dtfm=DateTimeFormatter.ofPattern("d.M.yyyy");
		
		LocalDate lDate2=LocalDate.parse(date, dtfm);
		boolean leapyear=lDate2.isLeapYear();
		System.out.println("leapYear=="+leapyear);
		
		
			for (int i = 1; i <= 12; i++) {
				String temp=new String(lDate2.getDayOfMonth()+"."+i+"."+lDate2.getYear());
				LocalDate lDate3=LocalDate.parse(temp, dtfm);
				int length=lDate3.lengthOfMonth();
				System.out.println(i+": "+length);
				
			}
		String start ="1.1."+lDate2.getYear();
		String end="1.5."+lDate2.getYear();
		LocalDate startDate=LocalDate.parse(start, dtfm);
		LocalDate endDate=LocalDate.parse(end, dtfm);
		
		System.out.println("Day of the year: "+endDate.getDayOfYear());
		
		
	}
	
}
