package Assement;

public class Forloop {

	public static void main(String[] args) {
		int num=8;
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
			}
			if(isPrime==true)
			{
				System.out.println("the number is a prime number");
			}
			else
			{
				System.out.println("the number is not a prime number");
			}
		}

	}

}
