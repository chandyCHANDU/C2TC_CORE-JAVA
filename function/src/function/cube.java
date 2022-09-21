package function;

public class cube 
{
	
	int volume(int r)
	{
	int vol = r*r*r;
	return vol;
	}
	double volume(double h,double r)
	{
		double vol = (22/7.0) *r*r*h;
		return vol;
	}
	
	double volume(double l,double b, double h)
	{
		double vol = l*b*h;
		return vol;
	}
	
	public static void main(String[] args) {
		cube obj=new cube();
		System.out.println("sphere volume =" +obj.volume(6));
		System.out.println("cyclinder volume =" +obj.volume(5,3.5));
		System.out.println("cubiod volume =" +obj.volume(7.5,3.5,2));
		
		// TODO Auto-generated method stub

	}

}
