package convert;
import java.util.*;
public class DistanceConvert {
	public void  Convert() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Distance in miles :");
		int miles=input.nextInt();
		double km=1.609*miles;
		System.out.println("converted values in kilometeres :"+km);
		System.out.println("Enter the distance in kilometres :");
		int kmInput=input.nextInt();
		double ConvertedMiles=kmInput/1.609;
		double metres =kmInput*1000;
		System.out.println("Converted value inn mile "+ConvertedMiles);
		System.out.println("Converted value in metres :"+metres);
		
		
	}

}
