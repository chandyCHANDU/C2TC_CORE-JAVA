package B25_corejava;

public class Output {

	 
	
		int i =10;
		
	}
	
	class B extends Output
	{
		int i=20;
	
	public static void main(String[] args) {
		Output a = new B();
		System.out.println("i="+a.i);
	}
		

	}


