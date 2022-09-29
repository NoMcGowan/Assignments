import java.util.Scanner;

public class Task1
{
	boolean unique(String chr)
	{
		for (int i = 0; i < chr.length(); i++)
			for (int n = i + 1; n < chr.length(); n++)
				if (chr.charAt(i) == chr.charAt(n))
					return false;
		return true;

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Task1 obj = new Task1();
		String input = sc.nextLine();
		
		if (obj.unique(input))System.out.println("true");
		else System.out.println("false");
	}

}