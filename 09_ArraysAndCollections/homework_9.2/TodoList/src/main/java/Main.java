import java.util.Scanner;

public class Main {

    private static final TodoList TODO_LIST = new TodoList();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать! Это список дел, введите команды из строки ниже:\n" +
                "LIST, ADD, EDIT, DELETE: ");
        String add = "^(ADD)\\s(\\D)+";
        String add2 = "^(ADD)\\s(\\d)+\\s(\\D)+";
        String get = "^(LIST)";
        String edit = "^(EDIT)\\s(\\d)+\\s(\\D)+";
        String del = "^(DELETE)\\s(\\d)+";

        while (true) {
            String input = new Scanner(System.in).nextLine();
            String[] words = input.split("\\s", 3);
            String todo = "Неверная команда!";
            int index;
            if (input.isEmpty()) {
                break;
            } else if (input.matches(add)) {
                todo = input.substring(4);
                TODO_LIST.add(todo);
            } else if (input.matches(add2)) {
                index = Integer.parseInt(words[1]);
                todo = words[2];
                TODO_LIST.add(index, todo);
            } else if (input.matches(get)) {
                TODO_LIST.getTodos();
            } else if (input.matches(edit)) {
                index = Integer.parseInt(words[1]);
                todo = words[2];
                TODO_LIST.edit(todo, index);
            } else if (input.matches(del)) {
                index = Integer.parseInt(words[1]);
                TODO_LIST.delete(index);
            } else {
                System.out.println(todo);
            }
        }
    }
}

