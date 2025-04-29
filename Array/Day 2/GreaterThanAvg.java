public class GreaterThanAvg {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
        }
        double avg=(double)sum/arr.length;
        System.out.println("The average no is :"+avg);
        for(int j=0;j<arr.length;j++){
            if(arr[j]>avg){
                System.out.println("The no which is greter than average is "+arr[j]);
                count++;
            }
        }
        System.out.println(count);
    }
}
