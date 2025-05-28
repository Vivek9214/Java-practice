import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class SortEvenFirst implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {
            return a.compareTo(b);
        } else {
            return aIsEven ? -1 : 1;
        }
    }
}

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumber = new ArrayList<>();
        myNumber.add(58);
        myNumber.add(52);
        myNumber.add(19);
        myNumber.add(1);
        myNumber.add(6);

        Comparator<Integer> myComparator = new SortEvenFirst();
        Collections.sort(myNumber, myComparator);

        for (int i : myNumber) {
            System.out.println(i);
        }
    }
}
