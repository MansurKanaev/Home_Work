public class Manager implements Employee {
    public static final double BONUS = 0.05;
    private int fixSalary = (int) (40_000 + (Math.random() * 30_000));
    private final int sales = (int) (115_000 + (Math.random() * 25_000));

    public Manager() {
        fixSalary += sales * BONUS;
    }

    @Override
    public int getMonthSalary() {
        return fixSalary;
    }

    public int getSales() {
        return sales;
    }
}
