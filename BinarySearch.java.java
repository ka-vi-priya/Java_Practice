import java.util.Scanner;
public class binary {
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
        int key=scanner.nextInt();

        binary bs=new binary();
        int result=bs.binarysearch(arr,key);
        if(result==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at:"+result);
        }
            
    }
    int binarysearch(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid+1;

            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
    }
}
