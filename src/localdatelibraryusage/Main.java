package localdatelibraryusage;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		LocalDateTime local = LocalDateTime.now(); // current 
		
		
		LocalDate localTwo 	= LocalDate.now();
		
		
		
		
		
		
		System.out.println(local); // Date , hour , min
		
		System.out.println(localTwo); // Date Only
		
		
		LocalDateTime localThree = LocalDateTime.MAX;
		
		
		System.out.println(localThree);
		
		Instant instant = Instant.now();
		
		ZoneId zone = ZoneId.systemDefault();
		
		
		
		System.out.println(instant);
		
		LocalDateTime localFive = LocalDateTime.ofInstant(instant, zone);
		
		System.out.println(localFive);
					
		
												// year  month  dofMonth   hour 	min 		sec 
		LocalDateTime localFour = LocalDateTime.of(2027, 11 ,		 1    , 12	, 		5, 		44); // set up local date
		
		 System.out.println(localFour);
		
		
		//System.out.printf("Current time is %tY %<tB %<td %<tT  ",localFour); // date time with format execute.
		
		
		ZoneId zoneTwo = ZoneId.of("Asia/Rangoon");
		
		LocalDateTime localSix = LocalDateTime.now(zoneTwo); // with zone 
		
		System.out.println("Myanmar Time " + localSix);
		
		Main m = new Main();
		m.lD();
		

	}
	
	
	public void lD () {
		
		ZoneId zoneId = ZoneId.of("Europe/Paris"); 
		
		Clock clock = Clock.system(zoneId); // using clock
		
		LocalDate localDate  = LocalDate.now(clock);
		
		System.out.println(localDate);
	}

}