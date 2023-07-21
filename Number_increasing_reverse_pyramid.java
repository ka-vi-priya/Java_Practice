package patterns;
import java.util.Scanner;

public class Number_increasing_reverse_pyramid {
	public static void main(String args[]) {
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no.of.rows to be printed");
		rows=scanner.nextInt();
		int i,j;
		
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("NUMBER INCREASING REVERSE PYRAMID");
	}
}
