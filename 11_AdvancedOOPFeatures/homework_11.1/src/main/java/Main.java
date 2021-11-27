import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort((o1, o2) -> {
           int comparisonSalary = o1.getSalary().compareTo(o2.getSalary());
           if(comparisonSalary != 0){
               return comparisonSalary;
           }
           return o1.getName().compareTo(o2.getName());
        });
        staff.forEach(System.out::println);

    }
}