public class CountNo {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,6,7,2,3};
        int count=0;
        int target=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
                System.out.println("found at index no "+ i+" the value of count is :"+count);
            }
        }
        System.out.println("The no of times 2 appears in this array is :"+ count);
    }
}
