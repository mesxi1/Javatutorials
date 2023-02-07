import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = { "Espresso", "Iced Coffee", "Macchiato" };
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);
        String updatemenu = Arrays.toString(menu);

        menu[2] = "latte";
        System.out.println(menu[2]);

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            // System.out.println(i + "." + menu[i]);
            newMenu[i] = menu[i];
            System.out.println(newMenu[i]);

        }
        newMenu[3] = "House bland";
        newMenu[4] = "Dark cofe";

        System.out.println(Arrays.toString(newMenu));

    }

}
