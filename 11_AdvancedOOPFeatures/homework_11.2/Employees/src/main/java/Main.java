import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        Optional<Employee> optional = staff.stream().filter(employee -> {
            LocalDate date = employee.getWorkStart().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int formattedYear = date.getYear();
            return formattedYear == year;
        }).max(Comparator.comparing(Employee::getSalary));
        return optional.get();
    }
}