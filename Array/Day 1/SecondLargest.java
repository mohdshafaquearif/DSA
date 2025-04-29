// second largest element element in an array



public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,66,7,8,9};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
                
            }
            else if(arr[i]>secondMax&& arr[i]!=max){
                secondMax=arr[i];

            }
        }
       if(secondMax==Integer.MIN_VALUE){
        System.out.println("No second largest element found");

       }
       else{
        System.out.println("Second Largest element is:"+ secondMax);
       }
    }
    
}
