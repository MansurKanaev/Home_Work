public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        CardAccount cardAccount = new CardAccount();
//        bankAccount.put(1000);
//        bankAccount.take(550);
//        bankAccount.take(150);
//        cardAccount.take(50);
//        bankAccount.getAmount();
//        System.out.println();

        //---------------------------------------------------------------------------------------------
        BankAcc mansurakk = new BankAcc();
        BankAcc dimaakk = new BankAcc();
        BankAcc dashaakk = new BankAcc();
        CardAcc cardAcc = new CardAcc();
        DepositAcc depositAcc = new DepositAcc();
        System.out.print("Мансур: ");
        mansurakk.put(10000);
        System.out.print("Мансур: ");
        mansurakk.send(dimaakk, 2000);
        System.out.print("Дима: ");
        dimaakk.getAmount();
        System.out.print("Мансур: ");
        mansurakk.send(dashaakk, 3500);
        System.out.print("Даша: ");
        dashaakk.getAmount();
        System.out.print("Мансур: ");
        mansurakk.getAmount();





    }
}
