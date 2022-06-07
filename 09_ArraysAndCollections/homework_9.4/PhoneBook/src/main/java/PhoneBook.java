import java.util.*;

public class PhoneBook {
    Map<String, List<String>> list = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        // проверка номера и имени
        String rxNumber = "[7-8][\\d]{10}";
        String rxName = "(?i)[\\D-\\s]+";

        if (!phone.matches(rxNumber)) {
            System.out.println("Неверный формат ввода");
            return;
        }
        if(!name.matches(rxName)){
            System.out.println("Неверный формат ввода");
            return;
        }
        // если введены оба параметра
        if (!phone.equals("") && !name.equals("")) {
            // если такой номер есть - удалить у прежнего имени
            for (String count : list.keySet()) {
                List<String> numbers;
                numbers = list.get(count);
                if (numbers.contains(phone)) {
                    numbers.removeIf(i -> i.contains(phone));
                }
            }
            // Если такое имя есть - добавить номер
            if (list.containsKey(name)) {
                List<String> numbers;
                numbers = list.get(name);
                numbers.add(phone);
                System.out.println("Контакт сохранен");
                return;
            }
            // Если такого номера и имени нет - записать новый контакт
            List<String> numbers = new ArrayList<>();
            numbers.add(phone);
            list.put(name, numbers);
            System.out.println("Контакт сохранен");
        }
        // удаление пустых контактов
        list.entrySet().removeIf(x -> (x.getValue().isEmpty()));
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String rxNumber = "[7-8][\\d]{10}";
        String key = "";
        if (phone.matches(rxNumber)) {
            for (String count : list.keySet()) {
                List<String> numbers;
                numbers = list.get(count);
                for (String s : numbers) {
                    if (s.equals(phone)) {
                        key = count;
                        break;
                    }
                }
            }
        } else {
            return "Некорректный ввод номера";
        }
        if (list.containsKey(key)) {
            String nam = String.valueOf(list.get(key));
            return key + " - " + nam.substring(1, nam.length() - 1);
        } else {
            return "Такого номера нет в телефонной книге";
        }
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        Set<String> set = new TreeSet<>();
        if (list.containsKey(name)) {
            String num = String.valueOf(list.get(name));
            set.add(name + " - " + num.substring(1, num.length() - 1));
        } else {
            System.out.println("Такого имени нет в телефонной книге");
        }
        return set;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> set = new TreeSet<>();
        for (String count : list.keySet()) {
            String nam = String.valueOf(list.get(count));
            set.add(count + " - " + nam.substring(1, nam.length() - 1));
        }
        return set;
    }
}
// для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
// это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения значения
        }
    */