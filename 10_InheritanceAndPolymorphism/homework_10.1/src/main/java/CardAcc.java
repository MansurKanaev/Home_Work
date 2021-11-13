public class CardAcc extends BankAcc {

    public boolean take(double amountToTake) {

        double postTaxAmount = amountToTake * 1.01;
        if (amountToTake < invoiceAmount) {
            super.take(postTaxAmount);
            return true;
        }
        return false;
    }
}
