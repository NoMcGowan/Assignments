package Lab;

public class BankAccount
{

	String owner;
	double balance;

	public BankAccount(String name, double initialbalance)
	{
		owner = name;
		balance = initialbalance;
	}

	void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}

	void withdraw(double amount)
	{
		this.balance = this.balance - amount;

		if (this.balance < 0)
		{
			System.out.println("The account is over draft!");
		}
	}
public double getBalance() {
	return balance;
}
public String getOwner() {
	return owner;
}
	void display()
	{
		System.out.println("=======================================================");
		System.out.println("Owner: " + owner);
		System.out.println("Balance: " + balance);
		System.out.println("=======================================================");
	}

}
