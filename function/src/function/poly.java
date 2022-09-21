package function;

public class poly {
void add (int a,int b)
{
	System.out.println("add 2 numbers"+(a+b));
}
void add (int a,int b,int c)
{
	System.out.println("add 2 numbers"+(a+b+c));
}

	public static void main(String[] args) {
		poly obj = new poly();
		obj.add(3, 4);
		obj.add(6,2,3);
		// TODO Auto-generated method stub

	}

}
