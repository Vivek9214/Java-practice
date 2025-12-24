interface InnerStuManSys {
    int TotMarOb();
    float Percentage();
    String Grade();
}
class StudentManagementSystem implements InnerStuManSys{
    private String name;
    private int roll;
    int totmark;
    StudentManagementSystem(String name, int roll, int[] marks){
        this.name = name;
        this.roll = roll;
        totmark += marks[0] += marks[1] += marks[2];
    }

    public int TotMarOb(){
        return totmark;
    }

    public float Percentage(){
        return (totmark * 100 ) / 300;
    }

    public String Grade(){
        if (totmark >= 90 && totmark <= 100) return "A+";
        else if (totmark >= 80 && totmark <= 89) return "A";
        else if (totmark >= 70 && totmark <= 79) return "B";
        else if (totmark >= 60 && totmark <= 69) return "C";
        else return "Fail";
    }
    public void StudInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No. " + roll);
        System.out.println("Total Marks" + TotMarOb());
    }
}

public class StuManSys{
    public static void main(String[] args) {
        String Name = "Ania";
        int roll = 001;
        int[] marks = {87,78,87};
        StudentManagementSystem s1 = new StudentManagementSystem(Name,roll, marks);
        System.out.println("Total Marks: " + s1.TotMarOb());
        System.out.println("Grade: "+s1.Grade());
        System.out.println("Percentage: "+s1.Percentage());
    }
}
