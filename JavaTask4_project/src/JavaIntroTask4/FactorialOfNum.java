package JavaIntroTask4;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		int fact = 1;  // local variable
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number num");
		int num = scr.nextInt();
		
		for(int i=1 ;i <= num;i++) { 
			fact = fact*i;  //
		}
		System.out.println("factorial of number is = "+ fact );

	}

}
