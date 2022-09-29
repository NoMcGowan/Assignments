import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		String pal, str = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word:");

		pal = sc.nextLine();
		int i = pal.length();

		for (int p = i - 1; p >= 0; p--)
		{
			str = str + pal.charAt(p);
		}
		if (pal.equalsIgnoreCase(str))
		{
			System.out.println("The string is palindrome.");
		} else
		{
			System.out.println("The string is not a palindrome.");
		}

	}
}