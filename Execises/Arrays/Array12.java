//Java Array Program For Array Rotation
public class Array12{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2, k=0,len= arr.length;
        int temp[] = new int[len];
        for(int i= d; i<arr.length; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0; i<d; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0; i< arr.length; i++){
            arr[i] = temp[i];
        System.out.println(arr[i]);
        }
    }
}