//Floor - return greatest element that are samller than or equal to target

import java.util.Scanner;
public class FloorNu {
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
        return arr[end];
        
    }
    
}
