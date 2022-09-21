package com.tns.program;

public class Myclass {
	public static void main(String [] args)
	{
		Addition a= new Addition();
		Subtraction s= new Subtraction();
		Multiplicaton m= new Multiplicaton();
		
		  a.calculate(10, 5);
		  s.calculate(3,5);
		  m.calculate(12,5);
	}

}
