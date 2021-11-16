import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;


    public void put(double amountToPut) {
        if (amountToPut >= 0.0) {
            super.put(amountToPut);
            lastIncome = LocalDate.now();
        }
    }


    public void take(double amountToTake) {

        if (getInvoiceAmount() != 0.0 && amountToTake <= getInvoiceAmount() && lastIncome.until(LocalDate.now(), ChronoUnit.DAYS) >= 30) {
            super.take(amountToTake);
        } else {
            System.out.println("Месяц еще не прошел!");
        }
    }
}
