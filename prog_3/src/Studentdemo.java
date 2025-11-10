import java.io.InputStream;
import java.util.Scanner;
public class Studentdemo {
	private String Usn;
	private String Name;
	private String Branch;
	private String Phoneno;
	  
	
	public Studentdemo(String Usn,String Name,String Branch,String Phoneno) {
		this.Usn=Usn;
		this.Name=Name;
		this.Branch=Branch;
		this.Phoneno=Phoneno;
		
	}
	void display()
	{
		System.out.println("Usn:"+Usn+"");
		System.out.println("Name:"+Name+"");
		System.out.println("Branch"+Branch+"");
		System.out.println("Phoneno"+Phoneno+"");
	}

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("how many student ?");
		int Size=read.nextInt();
		Studentdemo Objs[]=new Studentdemo[Size];
		read =new Scanner(System.in);
		for(int i = 0;i <Objs.length;i++)
		{
			String Usn,Name,Branch,Phoneno;
			System.out.println("Enter Usn,Name,Branch,phoneno");
			Usn=read.nextLine();
			Name=read.nextLine();
			Branch=read.nextLine();
			Phoneno=read.nextLine();
		    Objs[i]=new Studentdemo(Usn,Name,Branch,Phoneno);
		}
		for(int i=0;i<Objs.length;i++)
		{
			Objs[i].display();
		}
 read.close();
	}

}
