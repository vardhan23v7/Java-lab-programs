import java.util.*;
import java.io.*;
public class Filemethods {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the file name ");
		String S=input.nextLine();
		File f1=new File(S);
		System.out.println("File name "+f1.getName());
		System.out.println("Path "+f1.getPath());
		System.out.println("Abspath "+f1.getAbsolutePath());
		System.out.println("parent"+f1.getParent());
		System.out.println("This file is :"+(f1.exists()?"Exists":"Does not exist"));
		System.out.println("IS directory :"+f1.isDirectory());
	    System.out.println("contents:");
	    String[]filelist=f1.list();
	    try {
	    	for(int i=0;i<filelist.length;i++)
	    		System.out.println(" "+filelist[i]);
	    }
	    catch(NullPointerException e){
	    	System.out.println("Null pointer exception");
	    }
	    System.out.println("is readable"+f1.canRead());
	    System.out.println("is writeable"+f1.canWrite());
	    System.out.println("is absolute"+f1.isAbsolute());
	    System.out.println("is hidden"+f1.isHidden());
	    System.out.println("Enter the name of the directory to create :");
      String dirname=input.nextLine();
      File dir=new File(dirname);
      if(!dir.exists()) {
      dir.mkdir();
      System.out.println(dir+"created");
	} 
	else {
		System.out.println("Directory "+dir+"already exists");
	
	}
	}

}
