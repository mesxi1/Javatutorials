import java.util.*;

public class Systemin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        String Marta = scanner.nextLine();

        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
        System.out.println("ra gvaris aris Marta: " + Marta);
    }
}
