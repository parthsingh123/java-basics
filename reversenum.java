package work;

public class reversenum {

	public static void main(String[] args) {
		int number = 97868, revers = 0;
		while (number != 0) {
			int rmdr = number % 10;
			revers = revers * 10 + rmdr;
			number = number / 10;

		}
		System.out.println(revers);
	}

}
