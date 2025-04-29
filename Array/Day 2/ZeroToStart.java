import java.util.Arrays;

public class ZeroToStart {
    public static void moveZero(int[]arr){
        int j=arr.length-1;
        // place non-zero elemnt
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
            arr[j]=arr[i];
            j--;
        }
    }
    for(int i=j;i>=0;i--){
        arr[i]=0;
    }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,0,12};
        moveZero(arr);
        System.out.println(Arrays.toString((arr)));
    }
}
