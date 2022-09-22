package com.tns.program;

public class Primeaccount implements Account
{
	@Override
	public void deliverycharge() 
	{
		System.out.println("there is no delivery charge");
	}
	public static void main(String[] args)
	{
		Primeaccount pr=new Primeaccount();
		Nonprimeaccount non = new Nonprimeaccount();
		pr.deliverycharge();
		non.deliverycharge();
	}

	

}
