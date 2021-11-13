public class BankAcc {
    public  double invoiceAmount = 0.0;

    public double getAmount() {
        System.out.println("На счету: " + invoiceAmount + " Руб.");
        return invoiceAmount;
    }

    public void put(double amountToPut) {
        if (amountToPut >= 0) {
            invoiceAmount += amountToPut;
            System.out.println("Счет в банке пополнен +" + amountToPut + " Руб.");
        }
    }

    public boolean take(double amountToTake) {
        if (amountToTake <= invoiceAmount) {
            invoiceAmount -= amountToTake;
            System.out.println("Со счета сняли -" + amountToTake + " Руб.");
            return true;
        }
        return false;
    }

    public boolean send(BankAcc receiver, double amount){
        if (take(amount)){
            receiver.put(amount);
            return true;
        }
        return false;
    }
}
