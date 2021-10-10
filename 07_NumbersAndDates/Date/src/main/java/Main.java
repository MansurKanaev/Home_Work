import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        int day = 11;
        int month = 8;
        int year = 1998;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE",
                new Locale("us"));
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        String number = "";

        for (int i = 0; birthday.isBefore(today) || birthday.isEqual(today); i++) {
            number += i + " - " + formatter.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            System.out.println();
        }
        return number;

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
    }
}
