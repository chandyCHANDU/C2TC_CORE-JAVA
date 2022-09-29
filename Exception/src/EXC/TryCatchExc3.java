package EXC;

public class TryCatchExc3 {

	public static void main(String[] args) {
		int x=100,y=0;
		try
		{
			System.out.println("111");
			int z=x/y;
			System.out.println("result of z:"+z);
		}
catch(ArithmeticException ae)
		{
	System.out.println("hello java");
		}
		System.out.println("333");
	}

}
