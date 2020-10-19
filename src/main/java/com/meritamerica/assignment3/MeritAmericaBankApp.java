package com.meritamerica.assignment3;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MeritAmericaBankApp {
	public static void main(String[] args) throws ParseException {
		String s = "83,10000,0.02,01/02/2020";
		 SavingsAccount savingsAccount = SavingsAccount.readFromString(s);
		
	       
		
		
		String[] tokens = s.split(",");
		long ac= Long.parseLong(tokens[0]);
		double b = Double.parseDouble(tokens[1]);
		double interest = Double.parseDouble(tokens[2]);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yy");
	
		java.util.Date date = sdfmt1.parse(tokens[3]);
		
		System.out.println(ac +  "    " + b + "    " + interest +"  "+ date + "    " );
		System.out.println(savingsAccount.getBalance());
	}
}