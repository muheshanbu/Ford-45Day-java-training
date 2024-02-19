import java.util.Scanner;
public class ProfitLoss {
   
    public static void main(String[] args) {
//        System.out.println("h");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        double x = sc.nextDouble();
        System.out.println("Enter the price per dozen");
        double y = sc.nextDouble();
        System.out.println("Enter the selling price of 1 toy");
        double z = sc.nextDouble();

        double cp = y/12.0;
        double profit = z-cp;
        double profitPercent = 100*profit/cp;
        System.out.println("Sam's profit percentage is "+profitPercent+" percent");


    }
}

