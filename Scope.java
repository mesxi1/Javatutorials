public class Scope {

    static int dog = 5;

    public static void main(String[] args) {

        Somefunction();
        System.out.println(dog);

    }

    public static void Somefunction() {

        System.out.println(dog);
    }
}
