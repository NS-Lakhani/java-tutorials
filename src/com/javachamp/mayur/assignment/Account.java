package com.javachamp.mayur.assignment;

public class Account {

	private String accountNumber;
	private AccountType accountType;
	private float accountBal;

	public Account() {
		super();
	}

	public Account(String accountNumber, AccountType accountType, float accountBal) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBal = accountBal;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public float getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(float accountBal) {
		this.accountBal = accountBal;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountBal=" + accountBal
				+ "]";
	}

}
