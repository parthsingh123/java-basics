package work;

public class ifelseloop {

	public static void main(String[] args) {

		int a = 10;
		int b = 8;
		if (a < b) {
			System.out.println(a + "a is smaller ");
		} else {
			System.out.println(b + "b is smaller ");
		}

		int i = 75;

		if (i % 2 == 0) {
			System.out.println(i + " is even ");
		} else {
			System.out.println(i + " is odd");
		}

		int p = 19;
		if (p < 18) {
			System.out.println(p + "candidet is not eligible for voting");
		} else {
			System.out.println(p + "candidet is  eligible for voting");
		}
		int o = 19;
		if (o > 18) {
			System.out.println(o + "candidet is not eligible for voting");
		} else {
			System.out.println(o + "candidet is  eligible for voting");
		}

	}
}
