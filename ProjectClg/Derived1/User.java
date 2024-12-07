package ProjectClg.Derived1;
import java.util.*;
class Derived extends Base {// use in User.java
    private
    int num2;
    public 
    void derivedRead(){
    Scanner o2 = new Scanner(System.in);
    System.out.print("Enter the Second Number: ");
    num2 = o2.nextInt();

    }
    void derivedShow(){
        System.out.print(num2);
    }
}

class Base{
    private
    int num1;
    public
    void baseRead(){
        Scanner o1 =new Scanner(System.in);
        System.out.print("enter first Number:");
        num1 = o1.nextInt();

    }
    void baseShow(){
        System.out.println(num1);
    }
}

public class User{
    public static void main(String args[]){
        Derived d = new Derived();
        d.derivedRead();
        d.derivedShow();
        d.baseRead();
        d.baseShow();
    }
}