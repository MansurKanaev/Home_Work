import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            // Проверка на допустимые символы
            String formatNumber = input.replaceAll("[^0-9]", "");
            String regex1 = "7[0-9]{10}";
            String regex2 = "[0-9]{10,11}";
            String regex3 = "[0-9]{10}";
            String regex4 = "8[0-9]{10}";
            String formatNumber1 = formatNumber.replaceAll("^8[^0-9]{10}", "");
            String formatNumber2 = formatNumber1.replaceAll("^8", "7");

            if (!formatNumber.matches(regex2)) {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (formatNumber.matches(regex1)) {
                System.out.println(formatNumber);
                continue;
            }
            if (formatNumber.matches(regex3)) {
                System.out.println("7" + formatNumber);
                continue;
            }
            if (!formatNumber.matches(regex4)) {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (formatNumber.matches(formatNumber1)) {
                System.out.println(formatNumber2);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
