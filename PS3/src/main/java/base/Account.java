package base;

import java.util.Date;


import exceptions.InsufficientFundsException;
/**
 * A class used to create an account with an ID number that can
 * be deposited to, withdrawn from, and has a unique date created
 * attribute.
 * @author Mark Seda
 */
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	/**
	 * Creates a default Account object with id, balance, and interest rate of
	 * 0.
	 */
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	/**
	 * Creates an Account object with specified id and balance
	 * 
	 * @param id
	 *            identification number
	 * @param initbalance
	 *            starting balance
	 */
	public Account(int id, double initbalance) {
		this.id = id;
		this.balance = initbalance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	/**
	 * Gets identification number.
	 * @return identification number
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets identification number.
	 * @param id identification number
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets current balance of account.
	 * @return balance in dollars.
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets new balance for account.
	 * @param balance amount in dollars
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Gets current annual interest rate.
	 * @return annual interest rate
	 */
	public double getAnnualIntrestRate() {
		return annualInterestRate;
	}

	/**
	 * Sets new annual interest rate.
	 * @param annualIntrestRate annual interest rate
	 */
	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualInterestRate = annualIntrestRate;
	}

	/**
	 * Returns the exact date and time the account was created.
	 * @return date and time account created
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Withdraws a specified amount from an account. If the account does not have
	 * enough funds to withdraw, a custom InsufficientFundsException is thrown.
	 * @param amount amount to withdraw
	 * @throws InsufficientFundsException Displays amount of money short
	 */
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if (amount <= balance) {
			balance -= amount;
		} 
		else 
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	/**
	 * Adds a specified amount of money into an account. 
	 * @param amount money in dollars
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * Returns the monthly interest rate. 
	 * @return monthly interest rate
	 */
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}

}
