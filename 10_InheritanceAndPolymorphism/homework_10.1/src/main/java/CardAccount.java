public class CardAccount extends BankAccount {
    // поменял на protected
    protected void take(double amountToTake) {

        double postTaxAmount = amountToTake * 1.01;
        if (postTaxAmount <= invoiceAmount) {
            super.take(postTaxAmount);
        } else {
            super.take(amountToTake);
        }
    }
}
