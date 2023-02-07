public class ReturnValues {
    public static void main(String[] args) {
        double Area1 = calculateArea(2.5, 4.5);
        double Area2 = calculateArea(5.5, 7.5);
        double Area3 = calculateArea(8.5, 4.5);

        String InglishExplanation = explainArea("English");
        String FranchExplanation = explainArea("Franch");
        String SpainExplanation = explainArea("Spainh");
        String ItalianExplanation = explainArea("Default");

    }

    public static double calculateArea(double leangth, double width) {
        if (leangth < 0 || width < 0) {
            System.out.println("Invalid Dimensions");
            System.exit(0);
        }
        double Area = leangth * width;

        return Area;

    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Are equals length * width";

            case "Franch":
                return "Are  to fraanch";
            case "Spanish":
                return "Area to Spanish";
            default:
                return "Language not available";
        }
    }
}
