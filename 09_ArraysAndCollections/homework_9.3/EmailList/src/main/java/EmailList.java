import java.util.*;

public class EmailList {
    Set<String> treeSet = new TreeSet<>();

    public void commandEmailList(String command) {
        String add = "(?i)ADD\\s[\\d\\D]+[@][\\D]+\\.[\\D]{2,3}";
        String list = "(?i)LIST";
        if (command.matches(add)) {
            add(command.substring(4));
        } else if (command.matches(list)) {
            getSortedEmails();
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public void add(String email) {
        String add = "(?i)[\\d\\D]+[@][\\D]+\\.[\\D]{2,3}";
        if (email.matches(add)) {
            System.out.println("Добавлена почта \"" + email.toLowerCase() + "\"");
            treeSet.add(email.toLowerCase());
        }
    }


    public List<String> getSortedEmails() {
        if (treeSet.isEmpty()) {
            System.out.println("Нет почты, сначала добавьте");
        } else {
            for (String s : treeSet) {
                System.out.println(s);
            }
        }
        return new ArrayList<>(treeSet);
    }
}
