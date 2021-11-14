import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public void put(double amountToPut) {
        if (amountToPut >= 0) {
            super.put(amountToPut);
            lastIncome = LocalDate.now();
        }
    }

    public void take(double amountToTake) {
        if (!(amountToTake <= invoiceAmount)) {
            System.out.println("Сначала пополните счет!");
        } else if (amountToTake < invoiceAmount && lastIncome.until(LocalDate.now(), ChronoUnit.DAYS) >= 30) {
            super.take(amountToTake);
        } else {
            System.out.println("Месяц еще не прошел!");
        }
    }


}
