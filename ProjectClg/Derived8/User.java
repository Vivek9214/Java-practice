class Shape {
    public  void area(){
        System.out.println("Base class area method is invoked");
    }
}

class Rectangle extends Shape{
    private  double length;
    private  double breath;
        Rectangle ( double x, double y){
            length = x;
            breath = y;
            
        }
        public  void area(){
            System.out.println("Area of Reactangle is " + (length * breath));
    }
}

class Circle extends Shape{
    private  double radius;
    Circle (double r){
        radius = r;
    }
    public  void area(){
        System.out.println("Area of circle is "+ Math.PI*(radius * radius));
    }
}

public class User{
    public static void main(String[] args) {
        Shape s;
        Rectangle r = new Rectangle(5.5 , 6.6);
        s = r;
        s.area();
        Circle c = new Circle(7.7);
        s = c;
        s.area();
    }
}
