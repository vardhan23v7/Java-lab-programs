package convert;
import java.util.*;
public class Timeconverter {
       public void convert() {
    	   Scanner input=new Scanner(System.in);
    	   System.out.println("Enter time in hours :");
    	   int hours=input.nextInt();
    	   long minute=hours *60;
    	   long seconds=hours *60*60;
    	   System.out.println("Converted time :"+minute+"minutes and" +seconds+"seconds");
    	   System.out.println("enter the time in minutes :");
    	   int minutesInput=input.nextInt();
    	   int hoursConverted=minutesInput/60;
    	   long secondsconverted=minutesInput/60;
    	   System.out.println("Converted time :"+hoursConverted+"hours and "+secondsconverted+"second");
    	   
       }
}
