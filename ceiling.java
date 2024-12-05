//Celing of a number means find the smallest number in an array that is greater than or equal to target element
import java.util.Scanner;
public class ceiling {
    public static void main(String[] args){
        int[] array={23,34,45,56,67,78,89};
        System.out.println("Enter target element:" );
        Scanner scanner=new Scanner(System.in);
        int target=scanner.nextInt();

        int result=binarysearch(array,target);
        System.out.println(result);
    }

    static int binarysearch(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
        
    }
    
}


/* 
    public static void main(String[] args){

        int[] arr={23,34,45,67,78};
        int key=20;
 
        for(int i=0;i<arr.length-1;i++){
            if(key==arr[i]){
                System.out.println(arr[i]);
                break;
            }
            else if(arr[i]>key){
                System.out.println(arr[i]);
                break;
            }
            
        }
 */