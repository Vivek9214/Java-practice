package ProjectClg.Day1;
import java.util.*;
// Write a program to convert a given number of days into years, weeks and days.
public class Second{
    public static void Timeconvert(int totalDay){
        int y = 0; int w = 0; int d = 0;
        while(totalDay != 0){
        if(totalDay >= 365){ // For Year
            y++;
            totalDay -= 365;
        }

        if(totalDay >= 7  &&  totalDay < 365 && totalDay > 0){   // For Week
            if(totalDay <= 0){
                continue;
            }
            else{
                totalDay -= 7;
                w++;
            }
        }

        if(totalDay < 7 && totalDay >= 0){   // For Day
            d = totalDay;
            totalDay = 0;
        }
    }
    System.out.print("\nYear " + y + " Week " + w + " Day " + d);
}
        public static void main(String[] args) {
            Scanner o1 = new Scanner(System.in);
            System.out.println("Enter the days: " );
            int totalDay = o1.nextInt();
            
            //Another Code for this
            // int year = totalDay/365;
            // int Remday = totalDay - (year * 365);
            // int week = Remday /7;
            // Remday =   Remday - (week* 7);
            // System.out.print("Year " + year);
            // System.out.print("\nWeek " + week);
            // System.out.print("\nDays " + Remday);
            Timeconvert(totalDay);
    }
}
