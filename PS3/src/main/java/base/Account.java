package base;

public class Account {
	
	private int id;
	private double balance;
	private double annualIntrestRate;
	//private Date dateCreated;
	
	public Account()
	{
		this.id = 0;
		this.balance = 0;
		this.annualIntrestRate = 0;
	}
	
	public Account(int id, double initbalance)
	{
		this.id = id;
		this.balance = initbalance;
		this.annualIntrestRate = 0;
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
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}
	
	public void withdraw(double amount)
	{
		
	}
	
	public void deposit(double amount)
	{
		
	}

}
