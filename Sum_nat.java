package com.shan.numbers;
import java.util.Scanner;

public class Sum_nat {
	public static void main(String args[]) {
		int num,i;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scanner.nextInt();
		for(i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The value of first "+num+" natural number is "+sum);
		
		
	}

}

//print the sum of first n natural numbers