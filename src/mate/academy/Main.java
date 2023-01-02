package mate.academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
    }
}
