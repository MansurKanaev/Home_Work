public class Operator implements Employee {

    private final int fixSalary = (int )(25_000 + (Math.random() * 15_000));

    @Override
    public int getMonthSalary() {
        return fixSalary;
    }
}
