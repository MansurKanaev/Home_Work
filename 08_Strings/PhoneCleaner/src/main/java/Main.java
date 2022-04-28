
import java.util.Scanner;

public class Main {
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
            String result = "Неверный формат номера";

            if (formatNumber.matches(num8)) {
                result = formatNumber.replaceAll("^8", "7");
            } else if (formatNumber.matches(num7)) {
                result = formatNumber;
            } else if (formatNumber.matches(num10)) {
                result = "7" + formatNumber;
            }
            System.out.println(result);
        }
    }
}
