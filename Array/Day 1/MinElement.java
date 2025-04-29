
public class MinElement{
    public static void main(String[] args) {
        int arr[]={3,1,5,7,8,13};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}