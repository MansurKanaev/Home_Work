import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            emailList.commandEmailList(input);
        }
    }
}
