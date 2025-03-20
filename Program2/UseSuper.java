class Animal{
    Animal(){
        System.out.println("Animals constructor called");
    }
    void sound(){
        System.out.print("Animals makes a sound ");
    }
}
final class Dog extends Animal{//Dog class can't extends because of final keyword
    Dog(){
        super();       // Calls parent class constructor
        super.sound(); //Calls parent class method  
        System.out.println("Dog constructor is called");
    }
}
public class UseSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
