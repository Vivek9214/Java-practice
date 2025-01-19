//Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
import java.util.*;
public class Array6 {
    // function to find the second largest element
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
          System.out.println(arr[i]);
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        // If no second largest element
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}