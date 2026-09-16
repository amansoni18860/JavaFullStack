package List.DSA;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 9, 20 };
		int[] arr2 = { 3, 6, 23, 76, 553, 3333 };

		int[] c = new int[arr.length + arr2.length];

		merge(c, arr, arr2);

		for (int ele : c)
			System.out.print(ele + " ");

		System.out.println();

	}

	public static void merge(int[] c, int[] a, int[] b) {

		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}

		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
	}

}
