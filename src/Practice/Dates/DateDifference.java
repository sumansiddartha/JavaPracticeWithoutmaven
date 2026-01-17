package Practice.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateDifference {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		 Date firstDate = sdf.parse("06/24/2017");
		    Date secondDate = sdf.parse("06/30/2017");
		    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
		    System.out.println(diffInMillies);
		    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	
		    		System.out.println(diff);
		    		
		    		
		    		 LocalDateTime now = LocalDateTime.now();
		    		    LocalDateTime tenSecondsLater = now.plusSeconds(10);

		    		    long diff2 = ChronoUnit.SECONDS.between(now, tenSecondsLater);
		    		    
		    		    System.out.println(diff2);
		    		    LocalDateTime now2 = LocalDateTime.now();
		    		    LocalDateTime sixMinutesBehind = now.minusMinutes(6);
		    		    Duration duration = Duration.between(now2, sixMinutesBehind);
		    		    long diff3 = Math.abs(duration.toMinutes());
		    		    System.out.println(diff3);
		    		    
		    		    LocalDate aDate = LocalDate.of(2020, 9, 11);
		    		    LocalDate sixDaysBehind = LocalDate.now();

		    		    Period period = Period.between(aDate, sixDaysBehind);
		    		    int diff4 = Math.abs(period.getDays());
		    		    System.out.println(diff4);
		    		    
		    		    //Date of Birth calculation in java
		    		    
		    		    LocalDate birthDate = LocalDate.of(1989, 8, 17);
		    		    LocalDate currentDate = LocalDate.now();
		    		    int years = Period.between(birthDate, currentDate).getYears();
		    		    System.out.println(years);
		    		    
		    		    
		    		    
	}

}
