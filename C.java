package warmup1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C extends B{
	
public byte realM() {
	System.out.println("From C");
	return 2;
}
	public static void main(String[] args) {
		
	B b = new B();
	b.work();
//     ((B)b).realM();
//		System.out.println(LocalDate.now());
//		 System.out.println(LocalDateTime.now()); 
//		 LocalDate  today= LocalDate.of(1989,Month.FEBRUARY,05);
//		 System.out.println(today);
//		 LocalDate birthday = LocalDate.of(1900,Month.FEBRUARY, 1);
//		 System.out.println(birthday);
//		 
////		 public static LocalTime of(int hour,int minute);
//		 LocalTime breakTime = LocalTime.of(1, 00, 30, 4000);
//		 System.out.println(breakTime);
//		 
//		  LocalTime lt = LocalTime.of(17, 00, 55);
//		  System.out.println(lt);
//		  
//		  // LocalDate time does  not have new keyword if you have it it does not compile 
//          //it does not have available constructor
//		  
//		  LocalDateTime rightNow= LocalDateTime.of(2018,Month.FEBRUARY,5,11,11,10,100);
//		  System.out.println(rightNow);
//		  
//		  LocalDateTime twoYearsLater = rightNow.plusYears(2);
//		  System.out.println(twoYearsLater);
//		  
//		  LocalDateTime oneMonthBefore = rightNow.minusMonths(1);
//		  System.out.println(oneMonthBefore);
//		 LocalDateTime ld= twoYearsLater.plusMinutes(50);
//		 System.out.println(ld);
//		 
//		 LocalDateTime lct = rightNow.plusMinutes(100);
//		 System.out.println(lct);
//		 // unlike date manipulation method,period method can not be chained since it is static
//		 
//		 //ex: 
//		 
//		 Period twoYears =Period.ofYears(2);
//		 System.out.println(twoYears);
//		 Period promisedDate = Period.of(2, 2, 2);
//		 System.out.println(promisedDate);
//		 
//		 
//		 
//		 LocalDate now = LocalDate.now();
//		 DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_TIME;
//		 System.out.println(isoLocalDate);
//		 
//		 DateTimeFormatter f1 = DateTimeFormatter.ISO_DATE;
//		 DateTimeFormatter f2 = DateTimeFormatter.ISO_DATE_TIME;
//		 DateTimeFormatter f3 = DateTimeFormatter.ISO_WEEK_DATE;
//				 
//		 System.out.println(isoLocalDate.format(now));
//		 System.out.println(f1.format(now));
//		 
//		 DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd,yyyy,hh:mm");
//		 System.out.println(shortFormat.format(rightNow));
//		 
//		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}