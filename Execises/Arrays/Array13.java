//Java Array Program to Remove Duplicate Elements From an Array
public class Array13{
    public static void main(String[] args){
        int arr[] = {1,2,2,3,3,3,4,5};
        int len = arr.length;
        int temp[] = new int[len];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]== arr[j])
                    j--;
                else{
                    temp[j]=arr[j]; 
                }
            }
        }
    for(int i=0; i<len; i++){
    System.out.println(temp[i]);
        }
    }
}