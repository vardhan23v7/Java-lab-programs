import java.io.*;
public class callme {
   synchronized static void call(String msg) {
	   System.out.println("["+msg);
	   try {
		   Thread.sleep(1000);
	   }
	   catch (InterruptedException e){
		   System.out.println("Interrupted");
	   }
	   System.out.println("]");
   }
}
class caller extends Thread{
	String msg;
	public caller(String s) {
		msg=s;
	}
	public void run() {
		callme.call(msg);
	}
}