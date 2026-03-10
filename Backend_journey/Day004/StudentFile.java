package Week1.Day4;

class StudentInfo {
        String Sname;
        int roll;
        float marks;
        public StudentInfo(String Sname, int roll, float marks){
            this.Sname = Sname;
            this.roll = roll;
            this.marks = marks;
        }
        public float getMarks(){
            return marks;
        }
        public String getName(){
            return Sname;
        }
        public int getRoll(){
            return roll;
        }
        public void displayDetails(){
            System.out.println(Sname);
            System.out.println(roll);
            System.out.println(marks);
        }
    }
public class StudentFile{
    public static void main(String[] args){
        StudentInfo s1 = new StudentInfo("Vivek", 23, 78);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1.getMarks());
        s1.displayDetails();
        }
    }


