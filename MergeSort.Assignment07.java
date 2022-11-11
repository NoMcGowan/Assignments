
public class MergeSort
{

	public static void main(String[] args)
	{
		int[] a =
		{ 2, 1, 3, 5, 4, 6 };
		mergeSort(a, a.length);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static void mergeSort(int[] a, int s)
	{
		if (s < 2)

			return;

		int mid = s / 2;
		int[] l = new int[mid];
		int[] r = new int[s - mid];

		for (int i = 0; i < mid; i++)
		{
			l[i] = a[i];
		}
		for (int i = mid; i < s; i++)
		{
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, s - mid);

		merge(a, l, r, mid, s - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right)
	{

		int i = 0, j = 0, c = 0;
		while (i < left && j < right)
		{
			if (l[i] <= r[j])

				a[c++] = l[i++];
			else

				a[c++] = r[j++];

			while (i < left)

				a[c++] = l[i++];

			while (j < right)
				a[c++] = r[j++];

		}
	}
}
