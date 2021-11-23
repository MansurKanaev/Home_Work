import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private final List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employee.setCompany(this);
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        for (Employee e : employees) {
            hire(e);
        }
    }

    public void fire(Employee employee) {
        employee.setCompany(null);
        employees.remove(employee);
    }

    public int getIncome() {
        int income = 0;
        for (Employee e : employees) {
            if (e instanceof Manager) {
                income += ((Manager) e).getSales();
            }
        }
        return income;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getList(count, Comparator.reverseOrder());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getList(count, Comparator.naturalOrder());
    }

    private List<Employee> getList(int count, Comparator<Employee> cmp) {
        if (count > 0 && count <= employees.size()) {
            employees.sort(cmp);
            return employees.subList(0, count);
        } else {
            System.out.println("Введено неверное количество сотрудников");
            return new ArrayList<>();
        }
    }
}
