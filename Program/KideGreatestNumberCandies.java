import java.util.*;
public class KideGreatestNumberCandies {
    public static List<Boolean> KidsWithCandies(int[] candies, int extracandies){
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int candy : candies){
            if (candy > max) {
                max = candy;
            }
        }

        for(int candy : candies){
            result.add(candy + extracandies >= max);
        }
        return result;
    }
    public static void main(String[] args){
        int[] candies = {2,3,5,1,4};
        int extracandies = 3;
        System.out.println(KidsWithCandies(candies, extracandies));
    }
}
