import java.util.ArrayList;

public class PersonalAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    ArrayList<Amount> transactions;

    public  PersonalAccount(int accountNumber, String accountHolder)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            this.balance += amount;
            this.transactions.add(new Amount(amount, TransactionType.deposit));
            System.out.println("Deposited " + amount + " to " + accountHolder);
        } else {
            System.out.println("You don't have enough money to deposit.");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && this.balance >= amount)
        {
            this.balance -= amount;
            this.transactions.add(new Amount(amount, TransactionType.withdrawal));
            System.out.println("Withdrawn " + amount + " to " + accountHolder);
        } else {
            System.out.println("You don't have enough money to withdraw.");
        }
    }

    public void printTransactionHistory()
    {
        System.out.println("History of transaction: ");
        for(Amount transaction : transactions)
        {
            System.out.println(transaction);
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

}





