package com.javachamp.mayur.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Bank {

	private static int accountNumber = 123456;
	private static List<Customer> customerList = new ArrayList<>();

	public static void main(String[] args) {

		Bank bank = new Bank();

		Scanner sc = new Scanner(System.in);

		boolean bankingOps = true;

		while (bankingOps) {
			System.out.println("===========================");
			System.out.println("1. Open Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Apply for loan");
			System.out.println("5. Calculate compound interest for loan");
			System.out.println("0. Exit");
			System.out.println("===========================");

			System.out.print("Please select the option: ");
			int response = sc.nextInt();

			switch (response) {
			case 1:
				bank.openAccount();
				break;
			case 2:
				System.out.print("Enter the account number : ");
				String accNo = sc.next();
				Optional<Customer> customer = customerList.stream().filter(c -> c.getAccount().getAccountNumber().equals(accNo)).findFirst();
				
				if (customer.isEmpty()) {
					System.out.println("Account number not found.");
					break;
				}

				System.out.print("Enter the amount to deposit : ");
				float amt = sc.nextFloat();
				bank.depositMoney(customer.get(), amt);	
				break;
			case 3:
				bank.withdrawMoney();
				break;
			case 0:
				bankingOps = false;
			}
		}

		sc.close();
		System.out.println("Thank you for banking with us");
		System.exit(0);
	}

	public void openAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the following details to open an account:");
		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Account Type: 1. Saving 2. Current. Enter (1/2): ");
		int accType = sc.nextInt();

		System.out.print("Account Balance: ");
		float accBal = sc.nextFloat();

		Customer customer = new Customer();
		customer.setCustomerName(name);

		Account customer1Acc = new Account();
		customer1Acc.setAccountNumber(String.valueOf(accountNumber++));
		customer1Acc.setAccountType(accType == 1 ? AccountType.SAVING : AccountType.CURRENT);
		customer1Acc.setAccountBal(accBal);
		customer.setAccount(customer1Acc);

		customerList.add(customer);

		System.out.println(customerList);
		sc.close();
	}

	public void depositMoney(Customer customer, float depositAmount) {
		float accBal = customer.getAccount().getAccountBal();
		accBal += depositAmount;
		customer.getAccount().setAccountBal(accBal);
		customer.setAccount(customer.getAccount());
		System.out.println("Balance in your account is : " + accBal);
	}

	public void withdrawMoney() {

	}

}
