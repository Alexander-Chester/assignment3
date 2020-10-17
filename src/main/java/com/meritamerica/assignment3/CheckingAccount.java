package com.meritamerica.assignment3;

public class CheckingAccount extends BankAccount{
	
	final static double INTEREST_RATE = 0.1/100;

	CheckingAccount(double openingBalance) {
		super(openingBalance,INTEREST_RATE);
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
 