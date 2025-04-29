// Check if Array has Pair with sum k
// input: {1,2,4,4}
// k=8;
// Output true(4+4)

public class ArrayPairSum {
    public static void main(String[] args) {
        int []arr={1,2,4,4};
    int k=8;
    System.out.println(hasPairWithSum(arr,k));
}
public static boolean hasPairWithSum(int []arr, int k){
    int left=0,right=arr.length-1;
    while(left<right){
        int sum=arr[left]+arr[right];
        if(sum==k)return true;
        else if(sum<k)left++;
        else right--;

    }
    return false;
}
}