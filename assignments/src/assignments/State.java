package assignments;

public class State {
public void methodState()
{
	System.out.println("state method");
}
}
class city extends State
{
	public void methodcity()
	{
		System.out.println("city method");
	}
}
class district extends city
{
public void methoddistrict()
{
	System.out.println("district method");
}
	public static void main(String[] args) {
		district obj = new district();
		obj.methodState();
		obj.methodcity();
		obj.methoddistrict();
		// TODO Auto-generated method stub

	}

}
