//take inpute and arrange in accending order
import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter the size of Array: ");
        int n = o1.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = o1.nextInt();
        }

        System.out.print("Your output is :");
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }


    }
}
