import java.util.Scanner;

public class Arraysymmetric {

	public static void main(String[] args) {
		int arr1[],arr2[];
		int size;
		 
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		size=Sc.nextInt();
		
		arr1=new int[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<arr1.length;i++)
			arr1[i]=Sc.nextInt();
		
		System.out.println("enter array of Second element");
		arr2=new int[size];
		for(int i=0;i<arr2.length;i++)
			
			arr2[i]=Sc.nextInt();
		
		
		int even1=0,even2=0,odd1=0,odd2=0;
		for (int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
				even1++;
			else
				odd1++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
				even2++;
			else
				odd2++;
		}
		if(even1==even2&&odd1==odd2)
			System.out.println("Array is symetric");
		else
			System.out.println("Array is Asymmetric");
		

	}

}
