package assignments;
import java.util.Scanner;
public class temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int week=sc.nextInt();
		int temperature =30;
		for(int i=1;i<week;i++)
		{
			temperature=temperature-2;
			System.out.println(temperature);
		}
		

	}

}
