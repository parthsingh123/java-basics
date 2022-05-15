package Worksheet;

public class swapnumbers {

	public static void main(String[] args) {
int a = 5;
int b = 9;
System.out.println("before swap");
System.out.println("first num :"+ a);
System.out.println("second num :" + b);
a = a - b;
b = a + b;
a = b - a;
System.out.println("after swap");
System.out.println("first num :"+ a);
System.out.println("second num :"+ b);
	}

}
