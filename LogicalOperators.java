public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englisGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englisGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");

        } else {
            System.out.println("We are sorry you did'nt get the scolarship");
        }

        int credits = 56;
        double GPA = 1.4;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry you need at least 40 credits and a minimum ");
        }
    }
}
