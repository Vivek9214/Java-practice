class Base{
    public void display(){
        System.out.println("Base class display method is invoked");
    }
}
class Derived extends Base{
    public void display(){
        System.out.println("Derived class display method is invoked");
    }
}

class Derived2 extends Base{
    public void display(){
        System.out.println("Derived2 class Display method is invoked");
    }
}
public class User {
    public static void main(String[] args) {
        Base b1;  // Base class reference variable
        Derived d1 = new Derived();
        Derived2 d2 = new Derived2();
        b1 = d1;
        b1.display();// base class display
        b1 = d2;
        b1.display(); //because of static binding
    }
}
