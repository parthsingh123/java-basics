package work;

public class BubbleSortArray {

	static void bubblesort(int[] ar) {
		int n = ar.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (ar[j - 1] > ar[j]) {
					temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;

				}
			}

		}
	}

	public static void main(String[] args) {
		int ar[] = { 3, 33, 55, 64, 2, 23, 12 };
		System.out.println("befor bubbel sort :");
		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i]+" ");
		}
		System.out.println();
		bubblesort(ar);
		System.out.println("after bubble sort:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");

		}
	}

}
