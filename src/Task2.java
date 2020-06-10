import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.print("n=");
        int n;
        double p1Percentage = 0;
        double p2Percentage = 0;
        double p3Percentage = 0;

        int cntP1 = 0;
        int cntP2 = 0;
        int cntP3 = 0;

        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber<200){
                cntP1++;
            } else if(currentNumber>=200 && currentNumber<=699){
                cntP2++;
            } else if(currentNumber>=700 && currentNumber<=1000){
                cntP3++;
            }
        }

        p1Percentage = cntP1 * 100.0 / n;
        p2Percentage = cntP2 * 100.0 / n;
        p3Percentage = cntP3 * 100.0 / n;

        System.out.println(String.format("p1Percentage = %.2f%%", p1Percentage));
        System.out.println(String.format("p2Percentage = %.2f%%", p2Percentage));
        System.out.println(String.format("p3Percentage = %.2f%%", p3Percentage));
    }
}
