package staffinheritanceDemo;
import java.util.*;
public class staff {
	private String StaffId;
	private String Name;
	private String Phone;
	private String Salary;
	 
	public void readData() {
	 	Scanner reader=new Scanner(System.in);
		System.out.println("Enter StaffId,Names,Phone,Salary :");
		StaffId=reader.nextLine();
		Name=reader.nextLine();
		Phone=reader.nextLine();
		Salary=reader.nextLine();
	}
	public  void displayData(){
		System.out.println("Staff Id "+StaffId);
		System.out.println("Name "+Name);
		System.out.println("Phone "+Phone);
		System.out.println("Salary "+Salary);
	}

}
class Teaching extends staff{
	private String Domain;
	private String Publication;
	
	public void readData() {
		super.readData();
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter Domain ,Publication");
		Domain=reader.nextLine();
		Publication=reader.nextLine();
		
	}
	public void display() {
		super.displayData();
		System.out.println("Domain"+Domain);
		System.out.println("Publication"+Publication);
	}
	
}
class Techincal extends staff{
	private String Skill;
     
	public void readData() {
		super.readData();
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter Skill :");
		Skill=reader.nextLine();
	}
	public void displayData() {
	super.displayData();
	System.out.println("skill"+Skill);
	}
}
class contact extends staff{
	private String Period;
	public void readData() {
		super.readData();
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the contact peroid :");
		Period=reader.nextLine();
	}
	public void displayData() {
		super.displayData();
		System.out.println("Contact peroid "+Period);
	}


    public static void main(String[] args) {
        // Teaching staff
        Teaching teachStaff = new Teaching();
        teachStaff.readData();
        teachStaff.display();

        // Technical staff
        Techincal techStaff = new Techincal();  // Note class name is Techincal
        techStaff.readData();
        techStaff.displayData();

        // Contact staff
        contact contStaff = new contact();
        contStaff.readData();
        contStaff.displayData();
    }
}



