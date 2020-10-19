package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckingAccount extends BankAccount{
	
	final static double INTEREST_RATE = 0.1/100;

	CheckingAccount(double openingBalance) {
		super(openingBalance,INTEREST_RATE);
	}	
	
	
	
	CheckingAccount(long accountNumber, double balance, double interestRate){
		super(accountNumber, interestRate, interestRate);
	}
	CheckingAccount(double balance, double interestRate, java.util.Date accountOpenedOn){
		super(interestRate, interestRate, accountOpenedOn);
	
	}
	
	CheckingAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn){
		super(accountNumber, interestRate, interestRate, accountOpenedOn);
		
	}
	public static CheckingAccount readFromString(String s) throws ParseException {
		String[] tokens = s.split(",");
		long accountNumber = Long.parseLong(tokens[0]);
		double b = Double.parseDouble(tokens[1]);
		double interest = Double.parseDouble(tokens[2]);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yy");
	
			Date date = (Date)sdfmt1.parse(tokens[3]);
	
		CheckingAccount account = new CheckingAccount(accountNumber, b, interest, date);
		return account;
		
		
		
	}
}

/* 
 * public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		double interestAmount = this.interestRate;
		return interestAmount;
	}
	
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			return true; 
		} 	else {
			System.out.println("Error found: The amount entered for withdraw could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;
			}
	}
	
	public boolean deposit(double amount) {
		if (0 <= amount) {
			this.balance = this.balance + amount;
			return true;
		} 	else {
		System.out.println("Error found: The amount entered for deposit could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
		return false;
			}	
	}
	
	public double futureValue(int years) {
		this.futureValue = balance * Math.pow((1+ interestRate ), years);
		return this.futureValue;
	}
	
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String fV = numberFormat.format(this.futureValue);
		String clientCheckingAccount = "Balance: $" + this.balance +"\n" +
										"Interest Rate: " +this.interestRate + "\n"+ 
										"Balance in 3 years: " + fV ;
		return clientCheckingAccount;
	}*/
 