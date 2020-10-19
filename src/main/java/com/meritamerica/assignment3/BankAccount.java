package com.meritamerica.assignment3;

import com.meritamerica.assignment3.MeritBank;
import java.util.*;
public class BankAccount {
	
	private double  balance ;
	private double interestRate;
	 long accountNumber;
	 double futureValue;
	 double accountTotal;
	private MeritBank m = new MeritBank();
	java.util.Date accountOpenedOn;
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
		accountOpenedOn = accountOpenedOn();
		accountNumber = getAccountNumber();
	
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		accountOpenedOn = accountOpenedOn();
	}
	BankAccount(double balance, double interestRate, java.util.Date accountOpenedOn){
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
		accountNumber = getAccountNumber();

		
	}
	BankAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn){
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
		this.accountNumber = accountNumber;
		
	}
	public java.util.Date accountOpenedOn(){
		java.util.Date date = new java.util.Date();
		return date;
	}
	public java.util.Date getOpenedOn(){
		return accountOpenedOn;
	}
	
	public long getAccountNumber() {
		System.out.println("AccountNumber");
		return accountNumber;
	}
	
	/**public static BankAccount readFromString(String accountData) {
		
	}
	**/
	
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		this.balance = getCombinedBalance();//create in account Balance
		if((this.balance - amount) >= 0) {
			this.balance = this.balance - amount;
			return true;
		} else
		return false;
	}
	
	public boolean deposit(double amount) {
		if((this.balance + amount) <= 250000) {
			System.out.println("Deposit bank: "+ amount);
			this.balance = this.balance + amount;
			return true;
		} else 
			System.out.println(" more than 250000");
			return false;	
	}
	
	public double futureValue(int years) {
		this.futureValue = balance * Math.pow((1+ interestRate ), years);
		return this.futureValue;
	}

	public String toString() {
		return "";
	}
}

