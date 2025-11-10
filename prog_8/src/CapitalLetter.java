import java.util.*;
public class CapitalLetter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your String:");
		String Str=input.nextLine();
		int upper=0,number=0;
		int cnt[]=new int[5];
		for (int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			
			if(ch >= 'A' && ch <='Z') {
				upper++;
			}
			if(ch>= '0'&&ch<= '9') {
				number++;
			}
			if(ch== 'a'||ch=='A') {
				cnt[0]++;
			}
			else if(ch=='e'||ch=='E'){
				cnt[1]++;
			}
			else if(ch=='i'||ch=='I'){
				cnt[2]++;
			}
			else if(ch=='o'|| ch=='o') {
				cnt[3]++;
			}
			else if (ch=='u'|| ch=='U') {
				
			}
		}
      System.out.println("Upper case Letters :"+upper);
      System.out.println("Number of digits :"+number);
      System.out.println("Number of 'a'="+cnt[0]);
      System.out.println("Number of 'e'="+cnt[1]);
      System.out.println("Number of 'i'="+cnt[2]);
      System.out.println("Number of 'o'="+cnt[3]);
      System.out.println("Number of 'U'="+cnt[4]);
		
			
	}

}
