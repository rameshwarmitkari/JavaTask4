package JavaIntroTask4;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		
		//String str = "Guvi Geek";
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scr.nextLine();
		
		System.out.println("string length is = "+str.length());
	}

}
