import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Дело \"" + todo + "\" добавлено.");
    }

    public void add(int index, String todo) {
        if (index < todoList.size()) {
            System.out.println("Дело \"" + todo + "\" добавлено под индекс \"" + index + "\".");
            todoList.add(index, todo);
        } else {
            add(todo);
        }
    }

    public void edit(String todo, int index) {
        if (index < todoList.size()) {
            System.out.println("Дело \"" + todoList.get(index) + "\" заменено на \"" + todo + "\".");
            todoList.set(index, todo);
        } else {
            System.out.println("Дело с таким номером не существует.");
        }
    }

    public void delete(int index) {
        if (index < todoList.size()) {
            System.out.println("Дело \"" + todoList.get(index) + "\" удалено.");
            todoList.remove(index);
        } else {
            System.out.println("Дело с таким номером не существует.");
        }
    }

    public ArrayList<String> getTodos() {
        if (todoList.isEmpty()) {
            System.out.println("Нет дела сначала добавьте!");
        }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
        return todoList;
    }
}