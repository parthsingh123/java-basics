package work;

public class RemoveStringchar {

	public static void main(String[] args) {

		String str = "Welcome to java world ";
		System.out.println(removeCharAt(str,2));
	}

	private static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos+1);
	}

	
}
