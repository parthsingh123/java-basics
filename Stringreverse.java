package Worksheet;

public class Stringreverse {

	public static void main(String[] args) {
		String str = "parth";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("befor reversing String :"+ str);
		System.out.println("after reversing String :"+ reverse);
	}

}
