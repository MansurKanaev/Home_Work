public class TopManager implements Employee {
    private static final double BONUS = 2.5;
    private static final int MIN_INCOME = 10_000_000;
    private final int fixSalary =(int )(70_000 + (Math.random() * 40_000));
    private Company company;

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > MIN_INCOME) {
            return  (int) (fixSalary * BONUS);
        }
        return fixSalary;
    }
}
