import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        int day = 11;
        int month = 8;
        int year = 1998;

        collectBirthdays(year, month, day);
    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate toDay = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", Locale.ENGLISH);
        String text = "";

        for (int i = 0; i < 24; i++) {
            if (birthday.isBefore(toDay) || birthday.isEqual(toDay)) {
                text += i + " - " + formatter.format(birthday) + System.lineSeparator();
            }
            birthday = birthday.plusYears(1);
        }
        System.out.println(text);
        return text;

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
    }
}
