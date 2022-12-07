import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Btn_startingAndEndingDateFindMonday_ThursDay_Friday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//yyyy-mm-dd format
		//string s= "2022-02-01";
		//entering start date first
		String s = sc.nextLine();
		
		//String e = "2022-07-01";
		//enter ending date
		String e = sc.nextLine();
		
		LocalDate start = LocalDate.parse(s);
		LocalDate end = LocalDate.parse(e);
		
		List<LocalDate> totalMondays = new ArrayList<>();
		//for mondays
		LocalDate nextMonday = start;
		int daysToAdvance = 1;
		while(!nextMonday.isAfter(end)) {
			if(nextMonday.getDayOfWeek()==DayOfWeek.MONDAY) {
				daysToAdvance = 7;
				totalMondays.add(nextMonday);
			}
			nextMonday = nextMonday.plusDays(daysToAdvance);
		}
		System.out.println("All Mondays: " +totalMondays);
		daysToAdvance = 1;
		
		//for Thrusdays
		List<LocalDate> totalThursdays = new ArrayList<LocalDate>();
		LocalDate nextThursday = start;
	      daysToAdvance = 1;
	      while(!nextThursday.isAfter(end)) {
	    	  if(nextThursday.getDayOfWeek()==DayOfWeek.THURSDAY) {
	    		  daysToAdvance = 7;
	    		  totalThursdays.add(nextThursday);
	    	  }
	    	  nextThursday = nextThursday.plusDays(daysToAdvance);
	      }
	      System.out.println("All ThursDays: " +totalThursdays);
	      daysToAdvance = 1;
	      
	      //for Friidays
	      
	      List<LocalDate> totalFridays = new ArrayList<>();
	      LocalDate nextFriday = start;
	      daysToAdvance = 1;
	      while(!nextFriday.isAfter(end)) {
	    	  if(nextFriday.getDayOfWeek()==DayOfWeek.FRIDAY) {
	    		  daysToAdvance = 7;
	    		  totalFridays.add(nextFriday);
	    	  }
	    	  nextFriday = nextFriday.plusDays(daysToAdvance);
	      }
	      System.out.println("Total Fridays: " +totalFridays);
	      
	}
	

}
