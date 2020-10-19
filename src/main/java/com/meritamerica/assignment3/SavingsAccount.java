package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingsAccount extends BankAccount{
	
	
	final static double INTEREST_RATE = 1.0/100;
	
	
	SavingsAccount(double openingBalance) {
		super(openingBalance,INTEREST_RATE);
	}
	SavingsAccount(long accountNumber, double balance, double interestRate){
		super(accountNumber, balance, interestRate);
	}
	SavingsAccount(double balance, double interestRate, java.util.Date accountOpenedOn){
		super(balance, interestRate, accountOpenedOn);
	
	}
	
	SavingsAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn){
		super(accountNumber, balance, interestRate, accountOpenedOn);
		
	}
	public static SavingsAccount readFromString(String s) throws ParseException {
		String[] tokens = s.split(",");
		long accountNumber = Long.parseLong(tokens[0]);
		double b = Double.parseDouble(tokens[1]);
		double interest = Double.parseDouble(tokens[2]);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yy");
	
		Date date = sdfmt1.parse(tokens[3]);
	
		SavingsAccount account = new SavingsAccount(accountNumber, b, interest, date);
		return account;
		
		
		
	}
}



/*
 * //Getter
	public  double getBalance() {
		return this.balance;
	}
	//Getter
	public  double getInterestRate() {
		return this.interestRate;
	}
	
	//checks for balance and withdraws 
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			return true;
		}	else {
			System.out.println("Error found: The amount entered for withdraw could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;	
			}
	}
	//checks amount and deposits
	public boolean deposit(double amount) {
		if (0 <= amount) {
			this.balance = this.balance + amount;
			return true;
		} 	else {
			System.out.println("Error found: The amount entered for deposit could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;
			}		
	}
	//calculates interest
	public double futureValue(int years) {
		this.futureValue = balance * Math.pow((1+ interestRate ), 3);
		return this.futureValue;
	}
	
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String fV = numberFormat.format(this.futureValue);
		String savingsAccount = "Balance: $" + this.balance +"\n" +
								"Interest Rate: " +this.interestRate + "\n"+ 
								"Balance in 3 years: " + fV ;;
		return savingsAccount;
	}
 */
