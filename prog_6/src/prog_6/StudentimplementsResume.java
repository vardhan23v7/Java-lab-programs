package prog_6;
import java.util.*;

public class StudentimplementsResume {
	String personalinfo;
	String result;
	String discipline;
	
	
	
	void read () {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter student name ");
		personalinfo=Sc.next();
		System.out.println("enter the results");
		result=Sc.next();
		System.out.println("enter the Branch name ");
		discipline=Sc.next();
			
		}
	public void biodata() {
		System.out.println("Student name "+personalinfo);
		System.out.println("results"+result);
		System.out.println("branch name "+discipline);
		
	}
		
	}


