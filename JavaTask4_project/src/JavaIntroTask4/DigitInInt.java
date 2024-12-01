package JavaIntroTask4;

import java.util.Scanner;

public class DigitInInt {

	public static void main(String[] args) {
		
		int count=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scr.nextInt();
		
		while(num != 0) { // at each iteration it will check numner is zero or not
			num=num/10;
			count++;
		}
		System.out.println("count of digit in integer is= "+count);

	}

}
