package com.shan.arrays;
import java.util.Scanner;

public class Largestele {
	public static void main(String args[]) {
		System.out.println("Enter the length of an array:");
		Scanner scanner=new Scanner(System.in);
		int len,i;
		len=scanner.nextInt();
		int arr[]= new int[len+1];
		System.out.println("Enter the elements into an array:");
		for(i=0;i<len;i++) {
			arr[i]=scanner.nextInt();
		}
		int max=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				}
		}
		System.out.println("lagest element in array:"+max);
		
	}

}

//Find the largest element in the array
