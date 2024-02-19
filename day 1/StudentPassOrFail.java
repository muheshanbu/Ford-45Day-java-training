import java.util.Scanner;
public class StudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int failCount=0;
        int marks;

        System.out.println("Enter 6 subject marks:");

        while(i<6){
            marks = sc.nextInt();
            if(marks<45){
                failCount++;
            }
            i++;
        }

        String[] numWords = {"zero","one","two","three","four","five","six"};

        if(failCount==0) System.out.println("Student Passed!");
        else System.out.println("Student failed in "+numWords[failCount]+" subjects");
    }
}

