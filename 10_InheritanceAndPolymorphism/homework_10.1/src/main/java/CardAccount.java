public class CardAccount extends BankAccount {

    public void take(double amountToTake) {

        double postTaxAmount = amountToTake * 1.01;
        if (amountToTake >= 0) {
             super.take(postTaxAmount);
        }
    }

}
