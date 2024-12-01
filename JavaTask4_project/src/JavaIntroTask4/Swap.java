package JavaIntroTask4;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int temp;
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number num1");
		int num1 = scr.nextInt();
		System.out.println("Enter the number num2");
		int num2 = scr.nextInt();
		
		System.out.println("Before swapping num1= "+num1+" & num2= "+num2);
		
		//swapping logic with third variable
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping num1= "+num1+" & num2= "+num2);
		
	}

}
