import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер, имя или команду:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String rxName = "(?i)[\\D-]+";
            String rxNumber = "[7-8][\\d]{10}";
            String rxList = "(?i)LIST";
            // если введена команда LIST
            if (input.matches(rxList)) {
                System.out.println(phoneBook.getAllContacts());
                continue;
            }
            // Если введено Имя
            if (input.matches(rxName)) {
                if (phoneBook.getContactByName(input).equals(new TreeSet<>())) {
                    System.out.println("Введите номер телефона для абонента \"" + input + "\":");
                    Scanner number = new Scanner(System.in);
                    String phone = number.nextLine();
                    phoneBook.addContact(phone, input);
                } else {
                    System.out.println(phoneBook.getContactByName(input));
                }
                continue;
            }
            // Если введен номер
            if (input.matches(rxNumber)) {
                if (phoneBook.getContactByPhone(input).equals("Такого номера нет в телефонной книге")) {
                    System.out.println("Такого номера нет в телефонной книге");
                    System.out.println("Введите имя абонента для номера \"" + input + "\":");
                    Scanner names = new Scanner(System.in);
                    String name = names.nextLine();
                    phoneBook.addContact(input, name);
                } else {
                    System.out.println(phoneBook.getContactByPhone(input));
                }
                // Если введена неизвестная команда
            } else {
                System.out.println("Неверный формат ввода");
            }
        }
    }
}
