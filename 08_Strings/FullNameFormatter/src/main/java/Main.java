import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String surname = "";
            String name = "";
            String patronymic = "";
            String fullName = "";
            int amountText = 0;
            int amountSymbol = 0;
            int numberSpaces = 0;

            //Проверка строки на допустимые символы;
            for (int i = 0; i < input.length(); i++) {
                String symbol = input.substring(i, i + 1);
                char s = symbol.charAt(0);
                for (int x = 0; x < 65536; x++) {
                    char c = (char) x;
                    if (c >= 'А' && c <= 'я' || c >= 'A' && c<= 'z'|| c == 'ё' || c == 'Ё' || c == '-' || c == ' ') {
                        if (s == c) {
                            amountSymbol += 1;
                        }
                    }
                }
            }
            //Считаем количество пробелов (логика: если их количество равно 2ум, значит слов - 3);
            for (int i = 0; i < input.length(); i++) {
                String symbol = input.substring(i, i + 1);
                if (symbol.equals(" ")) {
                    numberSpaces += 1;
                }
            }

            //Вывод ошибки, если количество пробелов не соответствует или введены недопустимые символы;
            if (!(numberSpaces == 2) || !(amountSymbol == input.length())) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }


            //Печатаем фамилию;
            while (amountText < input.length()) {
                String symbol = input.substring(amountText, amountText + 1);
                amountText = amountText + 1;
                if (!symbol.equals(" ")) {
                    surname += symbol;
                } else {
                    break;
                }
            }

            //Печатаем имя;
            while (amountText < input.length()) {
                String symbol = input.substring(amountText, amountText + 1);
                amountText += 1;
                if (!symbol.equals(" ")) {
                    name = name + symbol;
                } else {
                    break;
                }
            }

            //Печатаем отчество;
            while (amountText < input.length()) {
                String symbol = input.substring(amountText, amountText + 1);
                amountText = amountText + 1;
                patronymic += symbol;
            }
            //Если один из элементов пуст - вывод ошибки
            if (surname.isEmpty() || name.isEmpty() || patronymic.isEmpty()) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }

            //Формируем строку вывода
            fullName = "Фамилия: " + surname + System.lineSeparator() +
                    "Имя: " + name + System.lineSeparator() + "Отчество: " + patronymic;
            System.out.println(fullName);
        }
    }
}
//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

