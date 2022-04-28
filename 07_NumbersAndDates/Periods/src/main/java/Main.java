

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1996, 1, 21);
        System.out.println(getPeriodFromBirthday(birthday));
    }

    private static String getPeriodFromBirthday(LocalDate birthday) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday, now);
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days ";
    }

}
