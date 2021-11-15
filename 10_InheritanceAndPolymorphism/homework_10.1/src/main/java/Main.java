public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();
        bankAccount.take(50);
        cardAccount.take(50);
        depositAccount.take(50);

        bankAccount.put(300);

        bankAccount.take(500);
        bankAccount.take(50);

        cardAccount.take(500);
        cardAccount.take(50);

        depositAccount.take(500);
        depositAccount.take(50);

        bankAccount.getAmount();

        //-------------------------------------------------------------------------

//        BankAcc mansurakk = new BankAcc();
//        BankAcc dimaakk = new BankAcc();
//        BankAcc dashaakk = new BankAcc();
//        System.out.print("Мансур: ");
//        mansurakk.put(10000);
//        System.out.print("Мансур: ");
//        mansurakk.send(dimaakk, 2000);
//        System.out.print("Дима: ");
//        dimaakk.getAmount();
//        System.out.print("Мансур: ");
//        mansurakk.send(dashaakk, 3500);
//        System.out.print("Даша: ");
//        dashaakk.getAmount();
//        System.out.print("Мансур: ");
//        mansurakk.getAmount();
//        mansurakk.put(5000);
//        System.out.print("Мансур: ");
//        mansurakk.getAmount();


    }
}
