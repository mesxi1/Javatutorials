import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wellcome to the java dealership");
        System.out.println("Select option 'a'  to buy a car");
        System.out.println("Select option 'b' to sell a car  ");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget? ");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Greate A Nisan Altima is available: ");
                    System.out.println("\nDo you have insurance? Write 'Yes' or 'No'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();

                    System.out.println("What is your credit score? ");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                        System.out.println("Congratulations You bue a car");

                    } else {
                        System.out.println("We are sorry you are not aligible ");
                    }

                } else {
                    System.out.println("We don't sell cars under 10000, SorrY!");
                }
                break;
            case "b":

                System.out.println("\nyou chouse option " + option);
                System.out.println("\nWhat is your selling price? ");
                int price = scan.nextInt();
                System.out.println("\nWhat is your car valued at? ");
                int value = scan.nextInt();
                if (value > price && price < 30000) {
                    System.out.println("\nWe will bue your car pleasure! ");
                } else {
                    System.out.println("Sorry ");
                }
                break;
            default:
                System.out.println("You chouse invalid option");

        }
        scan.close();

    }
}