import java.util.Arrays;
public class Insertion {
    public static void main(String[] args){
        int[] arr={23,45,12,2,89,90,45};
        sort(arr);
        System.out.println((Arrays.toString(arr)));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){ /* here arr.length-1 because in j loop it access i+1 th element which is not present in the array */
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
    
}
