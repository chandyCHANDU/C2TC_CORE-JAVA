package assignment3;


public class Prime implements Account {
	
	public void deliverycharge() 
	{
		System.out.println("there is no delivery charge");
	}
	public static void main(String[] args)
	{
		Prime pr=new Prime();
		Nonprime non = new Nonprime();
		pr.deliverycharge();
		non.deliverycharge();
}
}