import java.util.Scanner;
import java.util.Stack;

public class Task2
{
	 public static void main(String[] args) {

	     Scanner sc=new Scanner(System.in);

	        String input = sc.nextLine();
	        Stack<Character> stack = new Stack<Character>();

	        for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }

	        String pal = "";

	        while (!stack.isEmpty()) {
	            pal += stack.pop();
	        }

	        if (input.equals(pal))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	 }
}