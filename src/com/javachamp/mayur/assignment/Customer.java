package com.javachamp.mayur.assignment;

public class Customer {

	private String customerName;
	private Account account;

	public Customer() {
		super();
	}

	public Customer(String customerName, Account account) {
		super();
		this.customerName = customerName;
		this.account = account;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", account=" + account + "]";
	}

}
