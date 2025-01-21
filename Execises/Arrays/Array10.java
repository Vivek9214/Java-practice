//Given an array arr[] and an integer K, the task is to reverse every subarray formed by consecutive K elements.
import java.util.Arrays;

public class Array10 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int n = arr.length;
        //Sorting the Array
        Arrays.sort(arr);
        
        for(int i = 0; i< n; i +=k){
            int left = i; 
            int right = Math.min(i + k -1, n - 1);
            int temp;
            while(left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left+=1;
                right-=1;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
