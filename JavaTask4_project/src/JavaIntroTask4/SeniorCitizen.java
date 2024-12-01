package JavaIntroTask4;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the your age");
		int age = scr.nextInt();
		
		if(age >= 60) {
			System.out.println("Person is senior citizen");
		}else
		{
			System.out.println("Person is not senior citizen");
		}
	}
}
