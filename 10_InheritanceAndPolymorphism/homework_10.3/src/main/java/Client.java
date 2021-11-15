public abstract class Client {

    protected double invoiceAmount = 0.0;

    protected double getAmount() {
        System.out.println("На счету: " + invoiceAmount + " Руб.");
        return invoiceAmount;
    }

    protected void put(double amountToPut) {
        if (amountToPut > 0.0) {
            invoiceAmount += amountToPut;
            System.out.println("На счет зачислено: +" + amountToPut + " Руб.");
        }
    }

    protected void take(double amountToTake) {
        if (amountToTake >= invoiceAmount && invoiceAmount == 0.0) {
            System.out.println("Сначала пополните счет!");
        } else if (amountToTake > invoiceAmount && invoiceAmount > 0.0) {
            System.out.println("Нельзя снять больше, чем на счету!");
        } else if (amountToTake <= invoiceAmount) {
            invoiceAmount -= amountToTake;
            System.out.println("Со счета сняли: -" + amountToTake + " Руб.");
        }
    }

}
