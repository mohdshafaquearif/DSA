// We have to move neg no to starting

import java.util.Arrays;

public class MoveNegNo{
    public static void main(String[] args) {
        int arr[]={1,-2,3,-4,5,-6};
       int result[]= moveNegativeToFront(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] moveNegativeToFront(int[]arr){
       int index=0;
       int temp[]=new int[arr.length];
       for(int num:arr){
           if(num<0){
            temp[index++]=num;
           }
       }
       for(int num:arr){
           if(num>=0){
            temp[index++]=num;
           }
       }
       return temp;
        }

    }

