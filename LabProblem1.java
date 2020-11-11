package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LabProblem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Abstraction - ??? ????? ???? ?? ???? ????????????


        //Read Input
        int n = Integer.parseInt(reader.readLine());

        //
        for (int row = 0; row <= n; row++) {
            printCurrentRow(n, row);
        }

        for (int row = n - 1; row > 0; row--) {
            printCurrentRow(n, row);
        }

    }

    private static void printCurrentRow(int width, int row) {
        System.out.print(printSpace(" ", width - row));
        System.out.print(printSpace("* ", row));
        System.out.println();
    }


    private static String printSpace(String str, int count) {
        StringBuilder sb = new StringBuilder();
        while (count-- > 0) {
            sb.append(str);
        }
        return sb.toString();
    }
}
