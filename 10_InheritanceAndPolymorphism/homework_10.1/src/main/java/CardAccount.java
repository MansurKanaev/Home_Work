public class CardAccount extends BankAccount {

    public void take(double amountToTake) {

        double postTaxAmount = amountToTake * 1.01;
        if (postTaxAmount <= getInvoiceAmount()) {
            super.take(postTaxAmount);
        } else {
            super.take(amountToTake);
        }
    }
}
