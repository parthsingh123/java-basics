package work;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {

		double num1 ;
		double num2 ;
		double ans ;
		char op;
		
		Scanner re = new Scanner(System.in);
		System.out.println("Enter two number :");
		num1 = re.nextDouble();
		num2=re.nextDouble();
		System.out.println("\nEnter an operator(+,-,*,/):");
		
		op= re.next().charAt(0);
		switch(op) {
		case '+':ans = num1 + num2;
		break ;
		case '-':ans = num1 - num2;
		break ;
		case '*':ans = num1 * num2;
		break ;
		case '/':ans = num1 / num2;
		break ;
		default :System.out.println("Error Enter correct operator");
		return;
		}
		System.out.println("\n result is :\n");
		System.out.println(num1 +""+op+""+num2+"="+ans);
	}

}
