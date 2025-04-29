

public class CountEven {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        int arr[]={1,2,3,4,5,6,77,88,93,100,113};
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
                }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    
}
