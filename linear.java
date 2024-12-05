import java.util.Scanner;
public class linear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no.of.elements:" );
        int num=scanner.nextInt();

        int[] arr=new int[num];
        System.out.println("elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter element to search:" );
        int number=scanner.nextInt();

        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(number==arr[i]){
                System.out.println("found at "+(i+1));
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("not found");
        }

    }
 
}
