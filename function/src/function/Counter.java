package function;

public class Counter {
 static int x=0;
Counter()
{
	x++;
}
void display()
{
	System.out.println(x);
	
}
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.display();
		Counter c2 = new Counter();
		c2.display();
		Counter c3 = new Counter();
		c3.display();
		// TODO Auto-generated method stub

	}

}
