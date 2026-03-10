public class MinMaxInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int min = 1;
        int max = 1;
        for(int i : arr){
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
