

public class ReverseArray2 {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66};
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while(start<end){
            System.out.println("Swapping "+arr[start]+" with "+ arr[end]);
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
    
}
