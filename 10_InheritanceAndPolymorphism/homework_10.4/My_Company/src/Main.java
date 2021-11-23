import java.util.ArrayList;
import java.util.List;

public class Main extends Company {
    public static void main(String[] args) {
        Company company = new Company();
        Manager manager = new Manager();
        Operator operator = new Operator();
        company.hire(operator);
        company.hire(manager);

        for (int i = 0; i < 180; i++) {
            company.hire(new Operator());
        }
        List<Employee> workers = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            workers.add(new Manager());
            if (i % 8 == 0) {
                workers.add(new TopManager());
            }
        }
        company.hireAll(workers);

        System.out.println("Компания заработала: " + company.getIncome());
        PrintEmployees(company);
        List<Employee> employees = company.getEmployees();
        System.out.println("Всего сотрудников в компании: " + employees.size());

        for (int i = 0; i < 135; i++) {
            company.fire(employees.get(i));
        }
        System.out.println("Всего сотрудников в компании: " + company.getEmployees().size());
        PrintEmployees(company);
        System.out.println();
        System.out.println("Компания заработала: " + company.getIncome() + " руб.");

    }

    private static void PrintEmployees(Company company) {
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        System.out.println("Топ самых больших зарплат в компании: ");
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
        System.out.println();
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(30);
        System.out.println("Топ  самых маленьких зарплат в компании: ");
        for (Employee e : lowSalaryStaff) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
    }

}
