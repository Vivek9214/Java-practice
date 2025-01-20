//Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the 
//relative order of all non-zero elements.
import java.util.*;
public class Array9 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,0,5,0,0};
        int temp[] = new int[arr.length];
        int count = 0;

        //Copying nonzero value
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                temp[count++] = arr[i];
            }
        }
        //To fill remaining position in temp[] with zero
        while(count < arr.length){
            temp[count++] = 0;
        }
        System.out.print(Arrays.toString(temp));
    }
}
