package EXC;

public class TryCatchExc1 {

	public static void main(String[] args) {
		System.out.println("11");
		System.out.println("before divide");
		
		try
		{
			int x=10;
			System.out.println("after divide");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("a number cannot be divided");
		}
		System.out.println("22");
	}
	

}
