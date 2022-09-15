package assignments;
import java.util.Scanner;
public class smart {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
	int time=sc.nextInt();
	if(time<24)
	{
		System.out.println("light gets switched on in smart home");
	}
	else
	{
		System.out.println("light gets switched off in smart home");
	}
	}

}
