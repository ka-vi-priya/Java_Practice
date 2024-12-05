import java.util.Arrays;
public class Selection {
    public static void main(String[] args){
        int[] arr={12,29,25,8,32,17,40};
        sort(arr);
        System.out.println((Arrays.toString(arr)));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}



