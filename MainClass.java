package Lab;

public class MainClass
{

	public static void main(String[] args)
	{
		SavingsAccount Joe = new SavingsAccount(Joe, 100);
		Joe.owner = "Joe";
		
		
		Joe.display();
		
		Joe.deposit(500);
		Joe.withdraw(200);
		Joe.deposit(300);
		
		Joe.display();
		

	System.out.println(Joe.balance);

	}

}
