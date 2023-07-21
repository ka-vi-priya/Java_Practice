package com.shan.numbers;
import java.util.Scanner;

public class Factorial_recursion {
	public static void main(String args[]) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=scanner.nextInt();
		int result=factorial(num);
		System.out.println("The factorial of a number "+num+" is "+result);
	}
		public static int factorial(int n){
			if(n==0) {
				return 1;
			}
			else {
				return n*factorial(n-1);
			}
		}
		
}
//find the factorial of a number using recursion
