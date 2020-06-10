import java.util.Scanner;

public class STOP {
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int dots = n + 1;
        int underscore = 2*n + 1;

        System.out.printf("%s%s%s", String.format("%s", repeatStr(".", dots)),
                                    String.format("%s", repeatStr("_", underscore)),
                                    String.format("%s", repeatStr(".", dots)));
        System.out.println();

        underscore -= 2;
        dots--;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s//%s\\\\%s", repeatStr(".", dots), repeatStr("_",underscore), repeatStr(".", dots));
            System.out.println();
            underscore += 2;
            dots--;
        }

        System.out.printf("//%sSTOP!%s\\\\", repeatStr("_", (underscore-5)/2), repeatStr("_", (underscore-5)/2));
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%s\\\\%s//%s", repeatStr(".", i), repeatStr("_", underscore), repeatStr(".", i));
            System.out.println();
            underscore -= 2;
        }
    }
}
