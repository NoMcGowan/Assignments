import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class Task3
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();

		while (sc.hasNextLine())
		{
			String b = sc.nextLine();
			if (!b.isEmpty())
			{
				list.add(isBalanced(b));
			} else
			{
				sc.close();
				break;
			}
		}

		for (int n = 0; n < list.size(); n++)
		{
			System.out.println(list.get(n) + " ");
		}

	}

	private static boolean isBalanced(String b)
	{
		boolean bal = false;
		Stack<Character> stack = new Stack();
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < b.length(); i++)
		{

			if (b.charAt(i) == '{' || b.charAt(i) == '(' || b.charAt(i) == '[')
			{

				stack.push(b.charAt(i));
				num1++;
			}

			if (b.charAt(i) == '}' || b.charAt(i) == ')' || b.charAt(i) == ']')
			{

				stack.push(b.charAt(i));
				num2++;
			}

			if (stack.firstElement() == '}' || stack.firstElement() == ')' || stack.firstElement() == ']')
			{
				num2++;
			}

		}
		if (num1 == num2)
		{
			return true;
		}
		return false;

	}
}