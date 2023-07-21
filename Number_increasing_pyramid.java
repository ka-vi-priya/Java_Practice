package patterns;
import java.util.Scanner;

public class Number_increasing_pyramid {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int rows;
		System.out.println("enter no.of.rows to be printed:");
		rows=scanner.nextInt();
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("NUMBER INCREASING PYRAMID");
		
	}

}


//write a program to print NUMBER INCREASING PYRAMID