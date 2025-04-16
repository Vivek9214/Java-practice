import java.util.*;
public class Derived1 extends Base {// use in User.java
    private int num2;

    public void derivedRead() {
        Scanner o2 = new Scanner(System.in);
        System.out.print("Enter the Second Number: ");
        num2 = o2.nextInt();
    }

    void derivedShow() {
        System.out.print(num2);
    }
}
