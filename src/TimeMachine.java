import java.util.Scanner;

public class TimeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double heritage = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int years = 18;

        for (int currentYear = 1800 ; currentYear < yearToLive; currentYear++) {
            if(currentYear % 2 == 0){
                heritage -= 12000;
            } else {
                heritage -= (12000 + 50) * years;
            }

            years++;
        }

        if (heritage > 0){
            System.out.print("Yes! He will live a carefree life and will have %.2f%% dollars left.");
        } else {
            System.out.println(Math.abs(heritage));
        }
    }
}
