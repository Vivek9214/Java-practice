public class ThifCapability {
    public static int minCapability(int[] nums, int k) {
        int left = 1, right = (int) 1e9;  // Binary search space: min = 1, max = 10^9
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canRob(nums, mid, k)) {
                right = mid;  // Try to minimize capability
            } else {
                left = mid + 1;  // Increase capability
            }
        }
        return left;
    }

    private static boolean canRob(int[] nums, int capability, int k) {
        int count = 0;
        int i = 0;
        
        while (i < nums.length) {
            if (nums[i] <= capability) {
                count++;
                if (count == k) return true;  // If we rob exactly k houses, return true
                i++;  // Skip next house to avoid adjacency
            }
            i++;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, 9};
        int k1 = 2;
        System.out.println(minCapability(nums1, k1));  // Output: 5

        int[] nums2 = {2, 7, 9, 3, 1};
        int k2 = 2;
        System.out.println(minCapability(nums2, k2));  // Output: 2
    }
}
