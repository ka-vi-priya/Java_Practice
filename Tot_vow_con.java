package com.shan.numbers;

import java.util.Scanner;

public class Tot_vow_con {
	public static void main(String args[]) {
		String string="shanmathi";
		System.out.println("The string is "+string);
		int len,i;
		int count=0;
		Scanner scanner=new Scanner(System.in);
		len=string.length();
		for(i=0;i<len;i++) {
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println("The no.of vowels in a string is:"+count);
	
		int consonants=0;
		consonants=len-count;
		System.out.println("The no.of.consonants in a given string is "+consonants);
		
	}

}

//find the no.of.vowels and consonants in a given string