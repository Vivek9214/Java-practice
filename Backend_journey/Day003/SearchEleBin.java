public class SearchEleBin {
    public static int SearchEleBinary(int[] arr, int k){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int k = 4;
        System.out.println(SearchEleBinary(arr, k));
    }
}
