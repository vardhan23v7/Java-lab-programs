import java.util.*;
import java.io.*;
public class Nooflines {
     public static void main(string []args)throws Exception{
    	 System.out.println("Please enter the file name :");
    	 Scanner keyinput=new Scanner(System.in);
    	 String fname=keyinput.next();
    	 File fobj=new File(fname);
    	 Scanner treader=new Scanner(txt.file);
    	 int lcount=0;
    	 int wcount=0;
    	 int ccount=0;
    	 while(freader.hasNextLine()) {
    		 String line=freader.nexttime();
    		 lcount++;
    		 ccount+=line.length();
    		 String[]words=line.split("");
    		 wcount=wcount+words.length;
    	 }
    	 freader.close();
    	 keyinput.close();
    	 System.out.println("lines :%d\t:words:%d\tcharacters%d",lcount,wcount,ccount);
     }
}
