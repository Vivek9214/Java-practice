import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

// Create a Student Class
class Student {
    String name;
    int age;
    double percentage;

    // Constructor
    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
}

//Implements Comparator interface
class SortByAge implements Comparator<Student>{
    public int compare(Student obj1, Student obj2){
        Student a = (Student) obj1;
        Student b = (Student) obj2;
        if(a.age > b.age) return 1;
        if(a.age < b.age) return -1;
        return 0;
    }
}
class SortByPer implements Comparator<Student>{
    public int compare(Student obj1, Student obj2){
        Student a = (Student) obj1;
        Student b = (Student) obj2;
        if(a.percentage > b.percentage) return -1;
        if(a.percentage < b.percentage) return 1;
        return 0;
    }
}
public class ArrayList4 {
    public static void main(String[] args){

        //Create a ArrayList 
        ArrayList<Student> Class1 = new ArrayList<>();

        //Add Student Info
        Class1.add(new Student("Kunal", 19, 98));
        Class1.add(new Student("Gautam", 25, 86));
        Class1.add(new Student("Jinesh", 22, 95));

        //Sort the ArrayList according to custom Comparator
        Comparator<Student> myComparator = new SortByAge();
        Collections.sort(Class1, myComparator);

        //Print Studnet Name , age and percentage
        for(Student i : Class1){
            System.out.println(i.name+" " + i.age +" "+ i.percentage);
        }

    }
}
