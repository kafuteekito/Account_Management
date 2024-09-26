public class Main {
    public static void main(String[] args) {
        PersonalAccount myMBANK = new PersonalAccount(1, "Mark Twain");

        System.out.println("Deposited some money to account: " + myMBANK.getAccountHolder());
        myMBANK.deposit(200);
        myMBANK.deposit(50.5);
        myMBANK.deposit(-1);
        System.out.println();

        System.out.println("Spent some money from account: " + myMBANK.getAccountHolder());
        myMBANK.withdraw(20);
        myMBANK.withdraw(100.11);
        myMBANK.withdraw(1000.00);
        System.out.println();

        myMBANK.printTransactionHistory();
        System.out.println();

        System.out.println("Current Balance " + myMBANK.getBalance() + " for Account " + myMBANK.getAccountHolder() + " with number " + myMBANK.getAccountNumber());
    }
}