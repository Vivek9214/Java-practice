import java.util.Scanner;

public class StudentManagementSys {
    Scanner sc = new Scanner(System.in);
    private String StuName;
    private int RollNumb;
    private int NumSubjects;
    private String Class;
    private String[] Name;
    public void CreStudent(){
        System.out.println("-------Student Entry-------");
        System.out.print("Enter Name : ");
        StuName = sc.nextLine();
        System.out.print("Enter Roll Num. : ");
        RollNumb = sc.nextInt();
        System.out.print("Enter The Class : ");
        Class = sc.next();
        System.out.print("Enter Number of Subject : ");
        NumSubjects = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        Name = new String[NumSubjects]; // Initialize array after getting NumSubjects
    }

    public void getStudent(){
        System.out.println("------Student DATA------");
        System.out.println("Student Name : " + StuName);
        System.out.println("Roll No. : "+ RollNumb );
        System.out.println("Class : "+ Class);
        System.out.println("Number of Sujects : "+ NumSubjects);
    }

    public void setName(String name){
        StuName = name;
    }

    public void setRollNum(int num){
        RollNumb = num;
    }

    public void setClass(String num){
        Class = num;
    }

    public void setNumSub(int num){
        NumSubjects = num;
    }

    public void DelStud(){
        StuName = "";
        RollNumb = 0;
        Class = "";
        NumSubjects = 0;
        getSubjects();
    }

    public void defSubjects(){
        for(int i = 0; i < NumSubjects; i++){
            System.out.print("Subject " + (i+1) + ": ");
            Name[i] = sc.nextLine();
        }
    }

    public String getSubjects(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < NumSubjects; i++){
            result.append(Name[i]).append("\n");
        }
        return result.toString();
    }

}

class Main{
    public static void main(String[] args){
        StudentManagementSys Std = new StudentManagementSys();
        Std.CreStudent();
        Std.defSubjects();
        Std.getStudent();
        Std.getSubjects();
    }
}
