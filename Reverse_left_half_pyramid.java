package patterns;
import java.util.Scanner;

public class Reverse_left_half_pyramid {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int rows;
		System.out.println("enter the no.of.rows to be printed");
		rows=scanner.nextInt();
		int i,j;
		
		for(i=1;i<=rows;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=rows;j++) {
				System.out.print("*"+"");
			}
			
			System.out.println(" ");
		}
		System.out.println("REVERSE LEFT HALF PYRAMID");
	
	}

}

//write a program to print REVERSE LEFT HALF PYRAMID
