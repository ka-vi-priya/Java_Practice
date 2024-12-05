import java.util.Arrays;
public class MissingNum {
    public static void main(String[] args){
        int[] arr={0,1,3,2,5};
        int result=Findmissing(arr);
        System.out.println(result);

    }
    static int Findmissing(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;

    }
}
