//Reverse an array without using another array.
public class Array15{
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int len = arr.length;
    int count = len-1;
        for(int i = 0; i < len/2; i++){
                int temp;
                temp= arr[i];
                arr[i] = arr[count];
                System.out.println(arr[count]);
                arr[count--] = temp;
        }
        for(int i= 0; i< len; i++){
            System.out.print(arr[i]);
        }
    }
}