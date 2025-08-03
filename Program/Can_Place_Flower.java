class Place_Flowers {
    public static boolean Place_Flower(int[] flowerbed, int n) {
         int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            // Check if the current, left, and right plots are empty (or boundary)
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == len - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1; // Plant a flower
                count++;          // Increase count

                if (count >= n) return true;
            }
        }

        return count >= n;
    }
}

public class Can_Place_Flower {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 0, 1 };
        int n = 1;
        Place_Flowers flower = new Place_Flowers();
        System.out.println(flower.Place_Flower(arr, n));
    }
}
