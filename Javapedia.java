import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n***************Javapedia************");
        System.out.println("How meny  historical figures will you register?");

        int people = scan.nextInt();
        String[][] database = new String[people][3];

        scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure: " + (i + 1));
            System.out.print("\t  . Name:  ");
            database[i][0] = scan.nextLine();
            System.out.print("\t  . Date of bith: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t  . Occupation:  ");
            database[i][2] = scan.nextLine();
            System.out.println("\n");
        }
            System.out.println("There are the values you stored ");

              print2DArray(database);

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }

        }

    }
}
