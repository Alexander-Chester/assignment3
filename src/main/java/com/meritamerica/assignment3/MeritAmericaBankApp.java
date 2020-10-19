package com.meritamerica.assignment3;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MeritAmericaBankApp {
	public static void main(String[] args) throws ParseException {
		String s = "83,10000,0.02,01/02/2020";
		 SavingsAccount savingsAccount = SavingsAccount.readFromString(s);
		
		 AccountHolder accountHolder = new AccountHolder(
		        	"Sadiq",
		        	"",
		        	"Manji",
		        	"123456789");
		 CheckingAccount checkingAccount = accountHolder.addCheckingAccount(100);

	        double fv = 100.0 * Math.pow(1 + 0.0001, 3);
	        
	       System.out.println(fv + "  "+	checkingAccount.futureValue(3) + "   " + checkingAccount.getInterestRate());
	       
			
		
		
	}
}