import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            input(input);
            if (input.isEmpty()) {
                break;
            }
        }
    }

    public static void input(String input) {
        String add = "ADD\\s[\\d\\D]+";
        String list = "LIST";
        String edit = "EDIT\\s[0-9]+\\s[\\d\\D]+";
        String delete = "DELETE\\s[0-9]+";

        if (input.matches(add)) {
            todoList.add(input.substring(4));
        } else if (input.matches(list)) {
            todoList.getTodos();
        } else if (input.matches(edit)) {
            String regex = "EDIT\\s[0-9]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            matcher.find();
            int end = matcher.end();
            todoList.edit(input.substring(end + 1), Integer.parseInt(input.substring(5, end)));
        } else if (input.matches(delete)) {
            todoList.delete(Integer.parseInt(input.substring(7)));
        } else {
            System.out.println("Неизвестная команда");
        }
    }
}
