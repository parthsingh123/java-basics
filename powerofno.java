package work;

public class powerofno {

	public static void main(String[] args) {

		int b = 2;
		int e = 3;
		int result = 1;
		while (e != 0) {
			result *= b;
			--e;

		}
		System.out.println("sol:" + result);
	}

}
