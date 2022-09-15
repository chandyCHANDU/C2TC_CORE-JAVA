package B25_corejava;
import java.util.Scanner;
public class Scannerdemp
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		char gender=sc.next().charAt(0);
		int age=sc.nextInt();
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		// TODO Auto-generated method stub

	}

}
