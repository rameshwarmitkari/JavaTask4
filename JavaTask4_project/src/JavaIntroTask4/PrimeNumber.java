package JavaIntroTask4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number num");
		int num = scr.nextInt();
		int count=0;
		
		//0 & 1 are not prime numbers
		if(num >= 2) {
			
			//this loop will continue till num
			for(int i=2;i<num;i++) {
				
				if(num % i == 0) {
					System.out.println(num+" is not prime number");
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(num+" is  prime number");
			}
		}
		else
		{
			System.out.println("number is not prime number");
		}
	}
}
