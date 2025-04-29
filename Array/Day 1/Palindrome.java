// import java.util.*;
// public class Palindrome {
//     public static void main(String[] args) {
        
    
//     int arr[]={1,2,3,2,1};
//     boolean ispalindrome=true;
//     int i =0;
//     int j=arr.length - 1;
//     while(i<j){
//         System.out.println( "Comparing:"+ arr[i]+"and"+arr[j]);
//         if(arr[i]!=arr[j]){
//             ispalindrome=false;
//             break;
//         }
//         i++;
//         j--;

//     }
//     if(ispalindrome){
//         System.out.println("The array is palindrom");
    
//     }
//     else{
//         System.out.println("The array is no palindrome");
//     }}
// }

public class Palindrome{
    public static boolean isPalindrome(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
public static void main(String[] args) {
    int []test1={1,2,3,4,5};
    int []test2={1,2,3,4,3,2,1};
    System.out.println(isPalindrome(test1));
    System.out.println(isPalindrome(test2));
}
}
