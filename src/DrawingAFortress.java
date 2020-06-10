import java.util.Scanner;

public class DrawingAFortress {
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

        int colSize = n/2;
        int midSize = 2*n - 2*colSize - 4;

        String underscores = repeatStr("_", midSize);
        String arrows = repeatStr("^", colSize);

        System.out.println(String.format("/%s\\%s/%s\\", arrows, underscores, arrows));

        for(int row=1; row <= n-3; row++){
            System.out.println(String.format("|%s|", repeatStr(" ", 2*n - 2)));
        }

        String sideSpace = repeatStr(" ", colSize+1);
        System.out.println(String.format("|%s%s%s|", sideSpace, underscores, sideSpace));

        String middleSpace = repeatStr(" ", midSize);
        underscores = repeatStr("_", colSize);
        System.out.println(String.format("\\%s/%s\\%s/", underscores,middleSpace, underscores ));
    }
}
