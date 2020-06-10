import java.util.Scanner;

public class Hospital {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int countOfDoctors = 7;

        for( int day=1; day<=period; day++){
            int currentPatients = Integer.parseInt(scanner.nextLine());

            if((day % 3 == 0) && (untreatedPatients>treatedPatients)){
                countOfDoctors++;
            }

            if(currentPatients>countOfDoctors){
                treatedPatients += countOfDoctors;
                untreatedPatients += currentPatients - countOfDoctors;
            }else {
                treatedPatients += currentPatients;
            }
        }

        System.out.printf(String.format("Treated patients: %d, Untreated patients: %d", treatedPatients, untreatedPatients));
    }
}
