import java.util.Arrays;

public class ReferanceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = new String[3];
        String[] stafftoday = Arrays.copyOf(staffLastYear, staffLastYear.length);

        // staffThisYear[1] = "Abby";
        for (int i = 0; i < staffThisYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
        }

        staffThisYear[1] = "Abby";
        stafftoday[1] = "Misha";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(stafftoday));

    }
}
