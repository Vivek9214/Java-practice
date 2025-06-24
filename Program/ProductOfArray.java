import java.util.*;
public class ProductOfArray{
    public static int[] ProductOfArrays(int[] nums){
        int len = nums.length;
        int[] answer = new int[nums.length];

        int prefix = 1;
        for(int i = 0; i < len; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }
        
        int postfix = 1;
        for(int i = len - 1; i >= 0; i--){
            answer[i] *= postfix;
            postfix *= nums[i];
        }
        return answer;
    }
    public static void main(String[] args){
        int[] nums = {0,0};
        int[] nums2 = {-1,1,0,-3,3};
        int[] nums3 = {1,2,3,4};
        int[] result = ProductOfArrays(nums);
        System.out.println(Arrays.toString(result));
        result = ProductOfArrays(nums2);
        System.out.println(Arrays.toString(result));
        result = ProductOfArrays(nums3);
        System.out.println(Arrays.toString(result));
    }
}