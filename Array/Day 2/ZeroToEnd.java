// Move all zero at the end


import java.util.Arrays;
public class ZeroToEnd {
    public static void moveZeros(int[]arr){
        int j=0;// position to non zero
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,1,2};
       moveZeros(arr);
       System.out.println(Arrays.toString(arr));
    }
}
