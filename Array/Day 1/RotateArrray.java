// Rotate an array left by one Position;
import java.util.*;
public class RotateArrray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
      arr[arr.length-1]=temp;
      System.out.println(Arrays.toString(arr));
    }
}
