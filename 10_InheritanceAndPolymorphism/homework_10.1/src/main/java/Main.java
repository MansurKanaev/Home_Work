public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        bankAccount.put(1000);
        bankAccount.take(550);
        cardAccount.take(350);
        bankAccount.take(150);
        bankAccount.getAmount();
    }
}
