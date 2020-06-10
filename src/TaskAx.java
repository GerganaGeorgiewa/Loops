import java.util.Scanner;

public class TaskAx {
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int width = 5*n;
        int leftDashes = 3*n;
        int middleDashes = 0;
        int rightDashes = width - leftDashes - middleDashes - 2;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s*%s", repeatStr("-", leftDashes), repeatStr("-", middleDashes), repeatStr("-", rightDashes));
            System.out.println();
            middleDashes++;
            rightDashes--;
        }

        middleDashes--;
        rightDashes++;

        for (int i = 0; i < n-2; i++) {
            System.out.printf("%s%s*%s", repeatStr("*", leftDashes+1), repeatStr("-", middleDashes), repeatStr("-", rightDashes));
            System.out.println();
        }

        for (int i = 0; i < n/2 - 1; i++) {
            System.out.printf("%s*%s*%s", repeatStr("-", leftDashes), repeatStr("-", middleDashes), repeatStr("-", rightDashes));
            System.out.println();

            leftDashes--;
            middleDashes += 2;
            rightDashes--;
        }

        System.out.printf("%s%s%s", repeatStr("-", leftDashes), repeatStr("*", middleDashes+2), repeatStr("-", rightDashes));
        System.out.println();
    }
}
