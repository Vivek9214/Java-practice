class Date{
    private int day; //Encapsulation
    private int month;
    private int year;
    Date(int dd, int mm, int yy){
        System.out.println("Constructor of Data class is invoked");
        day = dd;
        month = mm;
        year = yy;
    }
    public String toString(){
        return (day + "/" + month + "/" + year);
    }
}
class Employee {
    private int id;
    private String name;
    private Date hireDate; //object of Data Class
    Employee(int num, String n,Date hire){
        System.out.println("Constructor of Employee class is invoked");
        id = num;
        name = n;
        hireDate = hire;
    }
    public void display(){
        System.out.print("id ="+ id);
        System.out.print(" Name =" +name);
        System.out.print(" hireDate ="+ hireDate);
    }
}
public class Composition {
    public static void main(String[] args) {
        Date d = new Date(10,12,24); 
        Employee emp = new Employee(101, "Vivek", d);
        emp.display();
    }
}
