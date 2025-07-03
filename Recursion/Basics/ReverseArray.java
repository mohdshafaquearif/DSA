import java.util.*;
public class ReverseArray
{
    public static void answer(int[] arr,int i, int n){
       
    if(i>=n/2){
        return ;
    }
    //swap(arr[start],arr[end-start-1]);
    int temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
    answer(arr,i+1,n);
    }
	public static void main(String[] args) {
	    int [] nums={2,4,6,8,10};
		answer(nums,0,nums.length);
		System.out.println(Arrays.toString(nums));
	}
}
