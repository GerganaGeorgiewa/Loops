import java.util.Scanner;

public class Butterfly {
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
        int halfRowSize = n-2;

        for (int i = 0; i < halfRowSize ; i++) {
            if (i % 2 != 0) {
                System.out.println(String.format("%s\\ /%s", repeatStr("*", halfRowSize), repeatStr("*", halfRowSize)));
            } else {
                System.out.println(String.format("%s\\ /%s", repeatStr("-", halfRowSize), repeatStr("-", halfRowSize)));
            }
        }

            System.out.println(String.format("%s @ %s", repeatStr(" ", halfRowSize), repeatStr(" ", halfRowSize)));

        for (int i = 0; i < halfRowSize ; i++) {
            if (i % 2 != 0) {
                System.out.println(String.format("%s\\ /%s", repeatStr("*", halfRowSize), repeatStr("*", halfRowSize)));
            } else {
                System.out.println(String.format("%s\\ /%s", repeatStr("-", halfRowSize), repeatStr("-", halfRowSize)));
            }
        }
    }
}
