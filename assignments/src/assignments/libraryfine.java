package assignments;
import java.util.Scanner;
public class libraryfine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n<=5)
		{
			System.out.println("library fine is 1 rs per day:" );	
		}
		else if(n>5)
		{
			System.out.println("library fine is 5 rs per day:");	
		}
		else if(n>10)
		{
			System.out.println("library fine is 10 rs per day:");	
		}
	}

}
