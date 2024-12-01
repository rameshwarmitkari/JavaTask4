package JavaIntroTask4;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);// To take user input at Run time
		
		System.out.println("Enter the number a");
		int a = scr.nextInt();
		
		System.out.println("Enter the number b");
		int b = scr.nextInt();
		
		System.out.println("Enter the number c");
		int c = scr.nextInt();
		
		System.out.println("Enter the number d");
		int d = scr.nextInt();
		
		//If statement to check the condition
		if(a+b > c+d) {
			System.out.println("Sum of a & b is greater than sum of c & d");
		}else
		{
			System.out.println("Sum of a & b is lesser than sum of c & d");
		}
	}

}
