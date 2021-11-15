public class LegalPerson extends Client {

    @Override
    protected void take(double amountToTake) {

        double postTaxAmount = amountToTake * 1.01;

        if (postTaxAmount <= invoiceAmount) {
            super.take(postTaxAmount);
        } else {
            super.take(amountToTake);
        }
    }
}
