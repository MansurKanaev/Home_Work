public class Main {

    public static void main(String[] args) {
        String pathMovementsCsv = "src/test/resources/movementList.csv";
        Movements movements = new Movements(pathMovementsCsv);
        System.out.println("Сумма расходов: " + movements.getExpenseSum() + " руб.");
        System.out.println("Сумма доходов: " + movements.getIncomeSum() + " руб.");
        System.out.println();
        System.out.println("Суммы расходов по организациям: ");
        movements.getListExpenses();
        System.out.println();
        System.out.println("Суммы доходов по организациям: ");
        movements.getListIncome();
    }
}
