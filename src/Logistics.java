import java.math.BigDecimal;
import java.util.Scanner;

public class Logistics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int countOfLoads = Integer.parseInt(scanner.nextLine());

        int sumOfTons = 0;
        double microbusTons = 0;
        double truckTons = 0;
        double trainTons = 0;

        double percentageMicrobus = 0;
        double percentageTruck = 0;
        double percentageTrain = 0;

        for (int i = 0; i <countOfLoads ; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            sumOfTons += tons;

            if(tons<=3){
                microbusTons += tons;
            } else if(tons>3 && tons<=11){
                truckTons += tons;
            } else {
                trainTons += tons;
            }
        }

        percentageMicrobus = (microbusTons * 100.0) / sumOfTons;
        percentageTruck = (truckTons * 100.0) / sumOfTons;
        percentageTrain = (trainTons *100.0) / sumOfTons;

        double totalPrice = ((microbusTons*200) + (truckTons*175) + (trainTons*120)) / sumOfTons;


        System.out.println(sumOfTons);
        System.out.println(String.format("Total price is %.2f", totalPrice));
        System.out.println(String.format("Microbus = %.2f%%", percentageMicrobus));
        System.out.println(String.format("Truck = %.2f%%", percentageTruck));
        System.out.println(String.format("Train = %.2f%%", percentageTrain));
    }
}
