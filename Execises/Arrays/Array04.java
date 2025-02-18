import java.util.*;
public class Array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        int[] brr = new int[5];
        for(int i= 0; i<=4; i++){
            arr[i] = i;
            brr[i] = arr[i];
        }
        for(int i= 0; i<= 4; i++){
            System.out.print(arr[i]+" ");
        }
        brr[2] = 3;
        System.out.println();
        for(int i = 0; i<=4; i++){
            System.out.print(brr[i]+" ");
        }
        sc.close();
            }
        }

