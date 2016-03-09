package base;
import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double initbalance)
	{
		this.id = id;
		this.balance = initbalance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntrestRate() {
		return annualInterestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualInterestRate = annualIntrestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 12);
	}

}
