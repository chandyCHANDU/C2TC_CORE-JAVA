package EXC;

public class TryCatchEX2 {

	public static void main(String[] args) {
		System.out.println("111");
		try
		{
			int x=12/0;
			System.out.println("result of x:"+x);
			System.out.println("333");
		}
catch(ArithmeticException ae)
		{
	System.out.println("hello world");
		}
		System.out.println("444");
	}

}
