import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело \"" + todo + "\"");
    }

    public void add(int index, String todo) {
        if (index >= todoList.size()) {
            todoList.add(todo);
            System.out.println("Добавлено дело " + todo);
        }
        else if (!(index < 0)) {
            System.out.println("Дело \"" + todoList.get(index) + "\" заменено на \"" + todo + "\"" + " Сдвигая дело(а) на  пункт ниже");
            todoList.add(index, todo);
        }
    }

    public void edit(String todo, int index) {
        if (!(index < 0) && !(index >= todoList.size())) {
            System.out.println("Дело \"" + todoList.get(index) + "\" заменено на \"" + todo + "\"");
            todoList.set(index, todo);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < todoList.size()) {
            System.out.println("Дело \"" + todoList.get(index) + "\" удалено");
            todoList.remove(index);
        } else System.out.println("Дело с таким номером не существует");
    }

    public ArrayList<String> getTodos() {
        if (todoList.isEmpty()) {
            System.out.println("Нет дел, сначала добавьте");
        }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
        return todoList;
    }
}