public class DiceJack {
    public static void main(String[] args) {

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
    }

    // 0 - 0.999999999999999999
    public static int rollDice() {
        double randomNumber = Math.random() * 6; // 0 -5.99999999999
        randomNumber += 1; // 1 -6.99999999999999
        return (int) randomNumber; // 1 -6

    }
}