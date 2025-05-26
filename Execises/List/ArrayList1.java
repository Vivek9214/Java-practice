import java.util.*;

public class ArrayList1{
    public static void main(String[] args)
    {
        ArrayList<Integer> StudentList = new ArrayList<>();
        ArrayList<String> Studentstring = new ArrayList<>();

        // Create a Scanner object to read input from the console
        Scanner o1 = new Scanner(System.in);

        System.out.print("Enter the Name of students:");
        String Name = o1.nextLine(); 
        Studentstring.add(Name);
        System.out.println("Enter the Address of students:");
        String Address = o1.nextLine();
        Studentstring.add(Address);
        System.out.print("Enter the rollno of students:");
        int Roll_No = o1.nextInt();
        StudentList.add(Roll_No);
        System.out.print("Enter the Age of students:");
        int Age = o1.nextInt();
        StudentList.add(Age);

        //Display 
        System.out.print(StudentList);
        System.out.print(Studentstring);
    }
}


