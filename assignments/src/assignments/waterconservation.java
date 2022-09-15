package assignments;
import java.util.Scanner;
public class waterconservation {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n==45)
		{
			System.out.println("no tax");
		}
		else if(n>45 && n<=75)
		{
			System.out.println("the tax rate is 475");
		}
		else if(n>75 && n<=125)
		{
			System.out.println("the tax rate is 750");
		}
		else if(n>125 && n<=200)
		{
			System.out.println("the tax rate is 1225");
		}
		else if(n>200 && n<=350)
		{
			System.out.println("the tax rate is 1650");
		}
		else if(n>350)
		{
			System.out.println("the tax rate is 2000");
		}
		
	}

}
