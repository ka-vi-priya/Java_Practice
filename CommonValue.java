package com.shan.arrays;
import java.util.Scanner;


public class CommonValue {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array1[]=new int[20];
		System.out.println("Enter the no.of.values in array1:");
		int n1=scanner.nextInt();
		System.out.println("Enter the elements in an array1:");
		for(int i=0;i<n1;i++) {
			array1[i]=scanner.nextInt();
		}
		int array2[]=new int[20];
		System.out.println("Enter the no.of.values in array2:");
		int n2=scanner.nextInt();
		System.out.println("Enter the elements in an array2:");
		for(int i=0;i<n2;i++) {
			array2[i]=scanner.nextInt();
		}
		System.out.println("common element betwwen two array:");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}
}

//find common elements between two array