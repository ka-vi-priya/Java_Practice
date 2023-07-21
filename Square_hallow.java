package patterns;
import java.util.Scanner;

public class Square_hallow {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int rows;
		System.out.println("Enter the no.of.rows:");
		rows=scanner.nextInt();
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=rows;j++) {
				if(i==1||i==rows||j==1||j==rows) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		
	}

}

//write a program to print SQUARE HALLOW PATTERN