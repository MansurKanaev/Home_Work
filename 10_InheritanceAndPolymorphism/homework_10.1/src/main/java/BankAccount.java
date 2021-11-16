public class BankAccount {

    private double invoiceAmount = 0.0;

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public double getAmount() {
        System.out.println("На счету: " + invoiceAmount + " Руб.");
        return invoiceAmount;
    }

    public void put(double amountToPut) {
        if (amountToPut >= 0.0) {
            invoiceAmount += amountToPut;
            System.out.println("Счет в банке пополнен +" + amountToPut + " Руб.");
        }
    }

    public void take(double amountToTake) {
        if (amountToTake > invoiceAmount && invoiceAmount == 0.0) {
            System.out.println("Сначала пополните счет!");
        } else if (amountToTake > invoiceAmount && invoiceAmount > 0.0) {
            System.out.println("Нельзя снять больше, чем на счету!");
        } else if (amountToTake <= invoiceAmount) {
            invoiceAmount -= amountToTake;
            System.out.println("Со счета сняли -" + amountToTake + " Руб.");
        }
    }
}
