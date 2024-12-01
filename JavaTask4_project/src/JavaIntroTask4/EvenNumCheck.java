package JavaIntroTask4;

import java.util.Scanner;

//Check number is even or not

public class EvenNumCheck {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scr.nextInt();
		
		//if the reminder is 0 then condition is true
		if(num % 2 ==0) {
			System.out.println(num +" -> num is even number ");
		}else {
			System.out.println(num +" -> num is odd number");
		}

	}

}
