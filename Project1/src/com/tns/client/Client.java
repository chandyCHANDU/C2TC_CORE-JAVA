package com.tns.client;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.Application.MMBankFactory;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) throws Exception {
		
		BankFactory s = new MMBankFactory();
		
		SavingAcc p = new MMSavingAcc( 1001,"chandana",2000,true);
		CurrentAcc n = new MMCurrentAcc (2001, "jayaram", 6000, 30);
		
		System.out.println("Saving Account ");
		p.withdraw(p.getAccBal());
		
		System.out.println("Current Account ");
		n.withdraw(n.getAccBal());
		
		System.out.println(s.getNewSavingAcc(1002, "nandhu",4000, true));
		System.out.println(s.getNewCurrentAcc(2002, "bindu", 8000, 40));
		
		System.out.println(p);
		System.out.println(n);

	}

}
