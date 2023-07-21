package com.shan.numbers;
import java.util.Scanner;

public class Fibonacci_recursion {
	public static void main(String args[]) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no.of.terms:");
		num=scanner.nextInt();
		System.out.println("The fibonacci sequence is");
		for(int i=0;i<=num;i++) {
			System.out.print(fibonacci(i)+",");
		}
	}
	
	public static int fibonacci(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}