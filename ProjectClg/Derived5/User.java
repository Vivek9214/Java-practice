class Person{
    private String name;
    Person(String s)
{
    //Name=S;
    setName (s);
}
public void setName(String S){
    name =S;
}
public String getName(){
    return name;
} 
public void Display(){
    System.out.println("name ="+ name);
}
}
class Employee extends Person {
private int empId;
Employee (String Sname,int id){
    super(Sname); // to call constructor
    empId=id;
}
public void setEmpid(int id){
    empId=id;
}
public int getEmpid(){
    return empId;
}
public void Display(){
    super.Display();
    System.out.println("empid="+ empId);
}
}
class hourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWork;

hourlyEmployee(String Sname,int id ,int hr,int hw){
    super(Sname ,id);
    hourlyRate=hr;
    hoursWork=hw;
}
public double getPay(){
    return (hourlyRate*hoursWork);
}
public void Display(){
    super.Display();
    System.out.println("hourlyRate="+hourlyRate);
    System.out.println("hoursWroks="+ hoursWork);
    System.out.println("pay="+ getPay());
}
}
public class User {
    public static void main(String[] args) {
        hourlyEmployee e1 = new hourlyEmployee("ABC", 101, 100, 200);
        e1.Display();
    }
}

