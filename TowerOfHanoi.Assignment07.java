
public class TowerOfHanoi
{
	static void towerOfHanoi(int n, char fromRod, char toRod, char aRod, char bRod)
	{
		if (n == 0)
			return;
		if (n == 1)
		{
			System.out.println("Move disk" + n + " from rod " + fromRod + " to rod " + toRod);
			return;
		}

		towerOfHanoi(n - 2, fromRod, aRod, bRod, toRod);
		System.out.println("Move disk " + (n - 1) + " from rod " + fromRod + " to rod " + bRod);
		System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
		System.out.println("Move disk " + (n - 1) + " from rod " + bRod + " to rod " + toRod);
		towerOfHanoi(n - 2, aRod, toRod, fromRod, bRod);
	}

	public static void main(String args[])
	{
		int n = 4;

		towerOfHanoi(n, 'A', 'D', 'B', 'C');
	}

}
