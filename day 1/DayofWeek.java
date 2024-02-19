import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {

        //1: Declare and Initialize array in a single line using curly braces.
//        String[] daysOfWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        //2: Declare and Initialize array elements using new keyword.
        String[] daysOfWeek = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 - 7 only)");
        int dayNumber = sc.nextInt();
        System.out.println("Day of the week is "+daysOfWeek[dayNumber-1]);
        sc.close();
    }
}