package com.tns.program;

public class Nonprimeaccount implements Account{
	@Override
	public void deliverycharge()
	{
		int d=200;
		System.out.println("the delivery charge "+d+" for non primeaccount");
	}

}
