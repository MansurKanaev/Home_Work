import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFormat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String formatNumber = input.replaceAll("[^\\d]+", "");
            String num10 = "[\\d]{10}";
            String num8 = "^8[\\d]{10}";
            String num7 = "^7[\\d]{10}";
            String rx1 = "(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
            String result = "Неверный формат номера";

            if (formatNumber.matches(num8)) {
                result = formatNumber.replaceAll("^8", "7");
            } else if (formatNumber.matches(num7)) {
                result = formatNumber;
            } else if (formatNumber.matches(num10)) {
                result = "7" + formatNumber;
            }

            Pattern pattern = Pattern.compile(rx1);
            Matcher matcher = pattern.matcher(result);
            StringBuilder format = new StringBuilder();
            while (matcher.find()) {
                matcher.appendReplacement(format, "+$1 ($2) $3-$4-$5");
            }
            matcher.appendTail(format);
            System.out.println(format);
        }
    }
}
