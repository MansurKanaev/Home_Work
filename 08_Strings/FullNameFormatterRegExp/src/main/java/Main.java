import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            // Проверка текста на допустимые символы
            String listLetters = "[а-яА-Я-еЁ]+";
            String regex = listLetters + "[\\s]+" + listLetters + "[\\s]+" + listLetters;
            if (!input.matches(regex)) {
                System.out.println("Введенная строка не является ФИО");
                continue;
            }
            // Формируем ввод
            String[] fullName;
            fullName = input.split("\\s");
            System.out.println("Фамилия: " + fullName[0] + "\n" + "Имя: " + fullName[1] + "\n" +
                    "Отчество: " + fullName[2]);
        }
    }
}