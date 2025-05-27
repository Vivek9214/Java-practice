import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Car {
    public String brand;
    public String model;
    public int year;
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
class SortByYear implements Comparator<Car>{
    public int compare(Car obj1, Car obj2){
        //Make sure that the object are Car Objects
        Car a = (Car) obj1;
        Car b = (Car) obj2;
        //Compare the year of both object
        if(a.year < b.year) return -1;
        if(a.year > b.year) return 1;
        return 0;
    }
}
public class ArrayList2 {
    public static void main(String[] args){
        //Create the list of Car
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW" , "X1", 1999));
        myCars.add(new Car("Honda" , "Accord" , 2006));
        myCars.add(new Car("Ford" , "Mustang", 1970));

        Comparator<Car> myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);
        for(Car a : myCars){
            System.out.println(a.brand + " " + a.model + " " + a.year);
        }
    }
}
