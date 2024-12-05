import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number=number1;
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum=sum+rem*rem*rem;
            number=number/10;
        }
        if(sum==number1){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}
