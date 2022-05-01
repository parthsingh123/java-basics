package work;

public class ReplaceString {

	public static void main(String[] args) {

		String str = "hello mayank";
		System.out.println(str.replace('m', 'r'));
		System.out.println(str.replaceFirst("lo", "ma"));
		System.out.println(str.replaceAll("he", "no"));
	}

}
