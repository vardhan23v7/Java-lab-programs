package prog_6;
import java.util.*;
public class TeacherimplementsResume {
      String Personalinfo;
      String Qualification;
      String Experience;
      String Achievement;
         
      
      
      void read() {
    	  Scanner Sc=new Scanner(System.in);
    	  System.out.println("Enter Staff name :");
    	  Personalinfo=Sc.next();
    	  System.out.println("enter the Qualification");
    	  Qualification=Sc.next();
    	  System.out.println("Enter the Experience ");
    	  Experience=Sc.next();
    	  System.out.println("enter the Achievement");
    	  Achievement=Sc.next();
      }
      public void  biodata() {
    	  System.out.println("Staff name "+Personalinfo);
    	  System.out.println("Qualification"+Qualification);
    	  System.out.println("Experence"+Experience);
    	  System.out.println("Achievement"+Achievement);
    	    	  
      }
      
}
