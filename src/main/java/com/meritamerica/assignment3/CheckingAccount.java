package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckingAccount extends BankAccount{
	
	final static double INTEREST_RATE = 0.0001;
	private static double balance;
	private static Date date;

	CheckingAccount(double openingBalance) {
		super(openingBalance,INTEREST_RATE);
	}	
	CheckingAccount(){
		super(MeritBank.getNextAccountNumber(), balance, INTEREST_RATE, date);
	}
	
	
	
	CheckingAccount(long accountNumber, double balance, double interestRate){
		super(accountNumber, balance, interestRate);
	}
	CheckingAccount(double balance, double interestRate, java.util.Date accountOpenedOn){
		super(balance, interestRate, accountOpenedOn);
	
	}
	
	CheckingAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn){
		super(accountNumber, balance, interestRate, accountOpenedOn);
		
	}
	public static CheckingAccount readFromString(String s) throws ParseException {
		double balance;
		double interest;
		long accountN;
		Date date;
		CheckingAccount account = new CheckingAccount();
		
	
		String[] tokens = s.split(",");
		try {
			 accountN = Long.parseLong(tokens[0]);
			 balance = Double.parseDouble(tokens[1]);
			 interest = Double.parseDouble(tokens[2]);
			 date = account.dateAccountOpened(tokens[3]);
		} catch (NumberFormatException e){
			throw e;
		}
		
		CheckingAccount account1 = new CheckingAccount(accountN, balance, interest, date);
		
		
		return account1;
		
		
		
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
 