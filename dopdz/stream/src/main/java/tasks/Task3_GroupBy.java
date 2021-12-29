package tasks;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Задания на groupingBy - очень полезная функция в Stream.
 * <p>
 * Есть список сотрудников Employee с 2-мя строковомы полями (имя + компания, где работает сотрудник).
 * Нужно потренироваться группировать сотрудников по компаниям.
 */
public class Task3_GroupBy {

    /**
     * Сгруппировать сотрудников по компании в Map.
     *
     * <p>Пример:
     * <pre>
     *      List(
     *           Employee("Boris", "Google"),
     *           Employee("Masha", "Google"),
     *           Employee("Lena", "Microsoft")
     *          )
     *      ->
     *      Map [
     *          "Google" => List(Employee("Boris", "Google"), Employee("Masha", "Google"))
     *          "Microsoft" => List(Employee("Lena", "Microsoft"))
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     * </pre>
     */
    public static Map<String, List<Employee>> groupByCompaniesAsList(Collection<Employee> employees) {
        employees.stream().collect(groupingBy(Employee::getCompany)).entrySet().forEach(System.out::println);
        return employees.stream().collect(groupingBy(Employee::getCompany));
    }

    /**
     * Сгруппировать сотрудников по компании в Map структуру, но сделать компании капсом.
     *
     * <p>Пример:
     * <pre>
     *      List(
     *           Employee("Boris", "Google"),
     *           Employee("Masha", "Google"),
     *           Employee("Lena", "Microsoft")
     *          )
     *      ->
     *      Map [
     *          "GOOGLE" => List(Employee("Boris", "Google"), Employee("Masha", "Google"))
     *          "MICROSOFT" => List(Employee("Lena", "Microsoft"))
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     *   - лямба функция как первый аргумент groupingBy
     *   - String::toUpperCase
     * </pre>
     */
    public static Map<String, List<Employee>> groupByCompaniesAsListUppercase(Collection<Employee> employees) {
         return employees.stream().collect(groupingBy(Employee::getCompany));
    }


//    Map<String, List<String>> targetTableColumnListMap = nqColumnMapList.stream().flatMap(m -> m.entrySet().stream())
//            .collect(Collectors.groupingBy(e -> e.getKey().toUpperCase(), Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

    /**
     * Тут почти тоже самое, но в значениях должны оказаться не List, а Set.
     *
     * <p>
     * Понадобиться
     * - Stream::collect
     * - Collectors.groupingBy
     * - Collectors.toSet (как downstream коллектор для groupingBy)
     * </pre>
     */
    public static Map<String, Set<Employee>> groupByCompaniesAsSet(Collection<Employee> employees) {
        System.out.println(employees.stream().collect(groupingBy(Employee::getCompany, toSet())));
        return employees.stream().collect(groupingBy(Employee::getCompany, toSet()));
    }

    /**
     * А здесь в значениях должны оказаться только имена
     *
     * <p>Пример:
     * <pre>
     *      List(
     *           Employee("Boris", "Google"),
     *           Employee("Masha", "Google"),
     *           Employee("Lena", "Microsoft")
     *          )
     *      ->
     *      Map [
     *          "Google" => Set("Boris", "Google")
     *          "Microsoft" => Set("Lena")
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     *   - Collectors.mapping
     *   - Collectors.toList
     * </pre>
     */
    public static Map<String, List<String>> groupByCompaniesAsString(Collection<Employee> employees) {
        System.out.println(employees.stream().collect(groupingBy(Employee::getCompany, mapping(Employee::getName, toList()))));
        return employees.stream().collect(groupingBy(Employee::getCompany, mapping(Employee::getName, toList())));
    }


    public static class Employee {
        private final String name;
        private final String company;

        public Employee(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public String getCompany() {
            return company;
        }
    }
}
