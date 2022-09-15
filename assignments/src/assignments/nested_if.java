package assignments;
import java.util.Scanner;
public class nested_if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if (n>0)
		{
			System.out.println(n + "positive");
			
		}
		else {
			if(n<0)
			{
				System.out.println(n + "negative");
				
			}
			else
			{
				System.out.println("zero");
			}
		}
		// TODO Auto-generated method stub

	}

}
