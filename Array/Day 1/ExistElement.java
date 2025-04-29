

public class ExistElement {
    public static void main(String[] args) {
        int arr[]={ 12,24,36,48,60};
        int element=34;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element fount at index no "+ i);
                found=true;
            }
           }
           if (!found){
            System.out.println("not found");
           }
    }
    
}
