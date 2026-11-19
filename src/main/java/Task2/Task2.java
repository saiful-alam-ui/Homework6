package lt.vcd;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task2 {

    public static long daysBetween(int year_from, int month_from, int day_from,
                                   int year_to, int month_to, int day_to) {
        LocalDate startDate = LocalDate.of(year_from, month_from, day_from);
        LocalDate endDate = LocalDate.of(year_to, month_to, day_to);

        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public static void main(String[] args) {
        long days = daysBetween(2026, 1, 1, 2026, 11, 20);
        System.out.println("Days between: " + days); // Output: 323
    }
}