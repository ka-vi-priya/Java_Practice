package com.shan.arrays;
import java.util.Scanner;

public class ArraySpecificValue {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array[]=new int[20];
		System.out.println("Enter the no.of.values:");
		int n=scanner.nextInt();
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter the number:");
		int number=scanner.nextInt();
		for(int i=0;i<n;i++) {	
			if(number == array[i]) {
				System.out.println("True");
			}		
		}		
	}
}

//Specific value contained in an array then return true
