import java.util.Scanner;
public class Cross {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCamps = sc.nextInt();

        // ARRAY TO STORE CITIZEN COUNT IN 1 CAMP
        int[] noOfCitizensIn1Camp = new int[noOfCamps];


        int totalCitizenCount = 0;
        // FOR LOOP (1 and 3)
//        for (int i=0;i<noOfCamps;i++){
//            noOfCitizensIn1Camp[i] = sc.nextInt();
//            totalCitizenCount+=noOfCitizensIn1Camp[i]; // (1)
//        }

        // WHILE LOOP (2)
        int i=0;
        while(i<noOfCamps){
            noOfCitizensIn1Camp[i] = sc.nextInt();
            totalCitizenCount+=noOfCitizensIn1Camp[i];
            i++;
        }

        // FOR-EACH LOOP (3)
//        for(int citizenCount: noOfCitizensIn1Camp){
//            totalCitizenCount+=citizenCount;
//        }

        System.out.println(totalCitizenCount);

    }
}
