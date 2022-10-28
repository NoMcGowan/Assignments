package Lab;

public class CheckingAccount extends BankAccount
{
private static final double Fee = .10;

	public CheckingAccount(String name, double initialbalance)
	{
		super(name, initialbalance);

	}
public void withdraw(double amount) {
	double amountFee = (amount + Fee);
	return;
}
}
