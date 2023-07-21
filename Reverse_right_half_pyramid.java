package patterns;
import java.util.Scanner;

public class Reverse_right_half_pyramid {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int rows;
		System.out.println("enter the no.of.rows to be printed");
		rows=scanner.nextInt();
		int i,j;
		
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("REVERSE RIGHT HALF PYRAMID");
	}

}

//write a program to print REVERSE RIGHT HALF PYRAMID