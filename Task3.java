import java.util.Scanner;
public class Task3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();

		int i = 0;
		boolean cap = true;
		StringBuilder sb = new StringBuilder(sen);
		while (i < sb.length()) {
		    if (sb.charAt(i) == '.') {
		        cap = true;
		    } else if (cap && !Character.isWhitespace(sb.charAt(i))) {
		        sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		        cap = false;
		    }
		    i++;
		}
		System.out.println(sb.toString());
	}

}
