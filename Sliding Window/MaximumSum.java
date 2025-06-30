public class MaximumSum {
   public static int findMaxSum(int arr[],int k){
        int maxSum=0;
        int windowSum=0;
        for(int i=0;i<k;i++){
      
            windowSum+=arr[i];
        }
        maxSum=windowSum;
// slide the window
      for(int i=k;i<arr.length;i++){
        windowSum+=arr[i]-arr[i-k];
        maxSum=Math.max(maxSum, windowSum);
      }
      return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2};
        int k=3;
        System.out.println("Max sum of subArray of size" +k +"is :"+ findMaxSum(arr,k));
    }

}
