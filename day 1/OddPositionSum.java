 import java.util.Scanner;
public class OddPositionSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 mobile prices:");
        int[] mobilePrices = new int[6];

        for(int i=0;i<6;i++){
            mobilePrices[i] = sc.nextInt();
        }

        int oddPositionstotalCost = 0;

        for(int i=1;i<6;i+=2){
            oddPositionstotalCost+=mobilePrices[i];
        }

        System.out.println("Sum of odd positions: "+oddPositionstotalCost);
    }
}
