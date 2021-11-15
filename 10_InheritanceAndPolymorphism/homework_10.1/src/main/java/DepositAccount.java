import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    // поменял на private
    private LocalDate lastIncome;

    // поменял на protected
    protected void put(double amountToPut) {
        if (amountToPut >= 0.0) {
            super.put(amountToPut);
            lastIncome = LocalDate.now();
        }
    }

    // поменял на protected
    protected void take(double amountToTake) {

        if (invoiceAmount != 0.0 && amountToTake <= invoiceAmount && lastIncome.until(LocalDate.now(), ChronoUnit.DAYS) >= 30) {
            super.take(amountToTake);
        } else {
            System.out.println("Месяц еще не прошел!");
        }
    }
}
