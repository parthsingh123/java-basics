
package work;

public class palindromenumber {

	public static void main(String[] args) {

		int N = 9668, reversN = 0, remainder;
		int originalN = N;
		while (N != 0) {
			remainder = N % 10;
			reversN = reversN * 10 + remainder;
			N /= 10;
		}
		if (originalN == reversN) {
			System.out.println(originalN + "is a palindrome number ");
		} else {
			System.out.println(originalN + "is not palindrom number ");
		}
	}

}
