package com.shan.numbers;
import java.util.Scanner;



public class Oddeven {
	public static void main(String args[]) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number to check if it is odd or even:");
		num =scanner.nextInt();
		
		if(num%2==0) {
			System.out.println(num +"is even");
		}
		else {
			System.out.println(num + "is odd");
		}

	}
	
}

//check whether the given number is odd or even