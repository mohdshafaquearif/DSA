// Maximum Size Subarray Sum Equals k
import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubarrayK {
    public static int maxSubArrayLen(int[]nums,int k){
        Map<Integer,Integer>map=new HashMap<>();
       int sum=0;
       int maxLen=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum==k){
            maxLen=i+1;
        }
        if(map.containsKey(sum-k)){
            maxLen=Math.max(maxLen,i-map.get(sum-k));
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
       }
       return maxLen;

    }
    public static void main(String args[]){
        int [] nums={1,-1,5,-2,3};
        int k=3;
        int result=maxSubArrayLen(nums,k);
        System.out.println("Lengthof longest subarray with sum"+k+"is:"+result);

    }
}
