package JavaIntroTask4;

import java.util.Scanner;

public class WelcomePrint {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scr.nextLine();
		System.out.println("Enter the num ");
		int num2= scr.nextInt();
		
		for(int i=1;i<num2;i++ ) {
			System.out.println(str);
		}

	}

}
