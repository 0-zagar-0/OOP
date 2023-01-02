package mate.academy;


import java.util.Random;

public class DayOfWeekSupplier {
    public DayOfWeek getRandomDayOfWeek() {
        int index = new Random().nextInt(DayOfWeek.values().length);
        return DayOfWeek.values()[index];
    }
}
