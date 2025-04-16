import java.util.*;

public class Base  {
    private int num1;

    public void baseRead() {
        Scanner o1 = new Scanner(System.in);
        System.out.print("enter first Number:");
        num1 = o1.nextInt();
    }

    void baseShow() {
        System.out.println(num1);
    }
}
