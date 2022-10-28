package Lab;

public class SavingsAccount extends BankAccount
{

	public SavingsAccount(String name, double initialbalance)
	{
		super(name, initialbalance);
	}
	private double balance;
	private double aInterestRate;
	private double withdraws;
	private double deposits;
	private double total;
	{
		this.aInterestRate = aInterestRate;
	}

	public void setaInterestRate(double aInterestRate)
	{
		this.aInterestRate = aInterestRate;
	}

	public void deposit(double amount) {
		deposits += amount;
	}
public void withdraw(double amount) {
	
	withdraws += amount;
}
public void depositInterest()
{
	double monthlyInterest = getBalance() * getMonthlyInterestRate();
	total += monthlyInterest;
	
}
public double getBalance()
{
	return balance;
}
public double getaInterestRate()
{
	return aInterestRate;
}
public double getMonthlyInterestRate()
{
	return aInterestRate / 12;
}
public double getdeposits() {
	return deposits;
}
public double getwithdraws() {
return withdraws;
}
public double gettotal() {
	return total;
}


}