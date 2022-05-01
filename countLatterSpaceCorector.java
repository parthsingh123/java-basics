package work;

public class countLatterSpaceCorector {

	public static void main(String[] args) {

		String text = "ljm,334m4  .rmkkfm5,4  4???4  44 dbg reb??";
		char[] ch = text.toCharArray();
		int latter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(ch[i])) {
				latter++;
			} else if (Character.isSpace(ch[i])) {

				space++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else {
				other++;
			}

		}
		System.out.println("Latter:" + latter);
		System.out.println("Space:" + space);
		System.out.println("Number:" + num);
		System.out.println("Other :" + other);
	}

}
