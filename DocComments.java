public class DocComments {
    public static void main(String[] args) {

    }

    /**
     * Function name: Greet
     * 
     * Inside the function:
     * 1.prints: 'Hi'
     * 
     */
    public static void Greet() {
        System.out.println("Hi");

    }

    /**
     * Function name: printText
     * 
     * @param name (String)
     * @param age  (String)
     */
    public static void printText(String name, String age) {
        System.out.println("Hi I an " + name + "and I am " + age + "old");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return (double)
     * 
     *         Inside functions:
     *         1.
     * 
     */
    public static double calculateArea(double length, double width) {
        double Area = length * width;
        return Area;

    }
}
