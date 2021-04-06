package datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zone1 {
	public static void main(String[] args) {  
	    ZoneId zone = ZoneId.systemDefault();     
	    System.out.println(zone);  
	    ZonedDateTime zone1= ZonedDateTime.now();
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    ZonedDateTime zone2   = zone1.withZoneSameInstant(zoneid2);   
	    System.out.println("In Tokyo Central Time Zone:"  + zone2);   
	  }       
}
