// Write a program to calculate the area and perimeter of rectangle.
public class First{
    public static int Area(int length, int width){
        return (length * width);
    }
    public static int Perameter(int length, int width){
        int p = 2*(length + width);
        return p;
    }

    public static void main(String[] args){
        int AreaOfRectangle = Area(23, 21);
        int PerameterOfRectanlge = Perameter(34,34);
        System.out.println("The Area of Rectangle is  = "+ AreaOfRectangle);
        System.out.println("Perameter of Rectangle is = "+ PerameterOfRectanlge);
    }
    
}
