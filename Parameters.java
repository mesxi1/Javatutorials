public class Parameters {
    public static void main(String[] args) {

        calculateArea(2.5, 4.5);
        calculateArea(5.5, 7.5);
        calculateArea(8.5, 4.5);

    }

    public static void calculateArea(double leangth, double width) {
        double Area = leangth * width;
        System.out.println("The Area is : " + Area);

    }
}
