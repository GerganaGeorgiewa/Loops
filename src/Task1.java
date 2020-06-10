import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the numbers: ");
        int max = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if(num>max){
                max=num;
            }
        }

        System.out.println("sum= " + sum);
        System.out.println("max= " + max);
    }
}
