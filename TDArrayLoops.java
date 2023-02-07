import java.util.Arrays;

public class TDArrayLoops {
    public static void main(String[] args) {

        int[][] grades = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 }
        };
        /*
         * for (int j = 0; j < grades[0].length; j++) {
         * System.out.print(+grades[0][j]);
         * 
         * }
         * System.out.print("\n");
         * for (int j = 0; j < grades[1].length; j++) {
         * System.out.print(+grades[1][j]);
         * 
         * }
         * System.out.print("\n");
         * for (int j = 0; j < grades[2].length; j++) {
         * System.out.print(+grades[2][j]);
         * 
         * }
         */

        for (int i = 0; i < grades.length; i++) {

            switch (i) {
                case 0:
                    System.out.print("Harry");
                    break;
                case 1:
                    System.out.print("Misha");
                    break;
                case 2:
                    System.out.print("Nino");
                    break;

            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println(grades[i][j] + " ");
            }

        }

    }
}