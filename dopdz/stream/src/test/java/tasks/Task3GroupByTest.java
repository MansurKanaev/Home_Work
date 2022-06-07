package tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3GroupByTest {

    Task3_GroupBy.Employee a = new Task3_GroupBy.Employee("Boris", "Google");
    Task3_GroupBy.Employee b = new Task3_GroupBy.Employee("Misha", "Google");
    Task3_GroupBy.Employee c = new Task3_GroupBy.Employee("Lena", "Microsoft");
    List<Task3_GroupBy.Employee> employees = Arrays.asList(a, b, c);

    @Test
    @DisplayName("groupBy(company) as List in values")
    void testGroupByTypeCompanyAsList() {
        var expected = new TreeMap<>() {{
            put("Google", Arrays.asList(a, b));
            put("Microsoft", List.of(c));
        }};

        assertEquals(expected, Task3_GroupBy.groupByCompaniesAsList(employees));
    }

    @Test
    @DisplayName("groupBy(uppercase company) as List in values")
    void testGroupByTypeCompanyAsListUppercase() {
        var expected = new TreeMap<>() {{
            put("GOOGLE", Arrays.asList(a, b));
            put("MICROSOFT", List.of(c));
        }};

        assertEquals(expected, Task3_GroupBy.groupByCompaniesAsListUppercase(employees));
    }

    @Test
    @DisplayName("groupBy(company) as Set in values")
    void testGroupByTypeCompany() {
        var expected = new TreeMap<>() {{
            put("Google", new LinkedHashSet<>(Arrays.asList(a, b)));
            put("Microsoft", new LinkedHashSet<>(List.of(c)));
        }};

        assertEquals(expected, Task3_GroupBy.groupByCompaniesAsSet(employees));
    }

    @Test
    @DisplayName("groupBy(company) as String in values")
    void testGroupByTypeCompanyAsString() {
        var expected = new TreeMap<>() {{
            put("Google", Arrays.asList("Boris", "Misha"));
            put("Microsoft", List.of("Lena"));
        }};

        assertEquals(expected, Task3_GroupBy.groupByCompaniesAsString(employees));
    }


}