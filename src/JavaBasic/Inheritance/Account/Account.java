package JavaBasic.Inheritance.Account;

public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $"+amount+" | New Balance: $"+balance );
    }
    public void withdraw(double amount){
        if (balance > amount){
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);
    }
}
