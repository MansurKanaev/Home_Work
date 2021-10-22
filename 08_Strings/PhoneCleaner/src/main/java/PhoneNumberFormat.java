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
            // Проверка на допустимые символы
            String formatNumber = input.replaceAll("[^0-9]", "");
            String regex1 = "[0-9]{10,11}";
            String regex2 = "7[0-9]{10}";
            String regex3 = "[0-9]{10}";
            String regex4 = "8[0-9]{10}";
            String formatNumber1 = formatNumber.replaceAll("^8[^0-9]{10}", "");
            String formatNumber2 = formatNumber1.replaceAll("^8", "7");

            String rx1 = "(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
            String rx2 = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
            Pattern pattern1 = Pattern.compile(rx1);
            Matcher matcher1 = pattern1.matcher(formatNumber);
            Pattern pattern2 = Pattern.compile(rx2);
            Matcher matcher2 = pattern2.matcher(formatNumber);
            Matcher matcher3 = pattern1.matcher(formatNumber2);
            StringBuilder strbuf1 = new StringBuilder();
            StringBuilder strbuf2 = new StringBuilder();
            StringBuilder strbur3 = new StringBuilder();

            while (matcher1.find()) {
                matcher1.appendReplacement(strbuf1, "+$1 ($2) $3-$4-$5");
            }
            matcher1.appendTail(strbuf1);

            while (matcher2.find()) {
                matcher2.appendReplacement(strbuf2, "+7 ($1) $2-$3-$4");
            }
            matcher2.appendTail(strbuf2);

            while (matcher3.find()){
                matcher3.appendReplacement(strbur3,"+$1 ($2) $3-$4-$5");
            }
            matcher3.appendTail(strbur3);

            if (!formatNumber.matches(regex1)) {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (formatNumber.matches(regex2)) {
                System.out.println(strbuf1.toString());
                continue;
            }
            if (formatNumber.matches(regex3)) {
                System.out.println(strbuf2.toString());
                continue;
            }
            if (!formatNumber.matches(regex4)) {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (formatNumber.matches(formatNumber1)) {
                System.out.println(strbur3.toString());
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
