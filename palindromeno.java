package Worksheet;

public class palindromeno {

	public static void main(String[] args) {
		int N = 2992, reverseN = 0, remainder;
		int originalN = N;
		while (N != 0) {
			remainder = N % 10;
			reverseN = reverseN * 10 + remainder;
			N /= 10;

		}
		if (originalN == reverseN) {
			System.out.println(originalN + "is palindrome no");
		} else {
			System.out.println(originalN + "is not palindrome no");
		}

	}

}
