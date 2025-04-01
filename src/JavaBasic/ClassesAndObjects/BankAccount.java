package JavaBasic.ClassesAndObjects;

import java.util.Scanner;

public class BankAccount {
    double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $"+ amount);
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient Funds! ");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $"+amount);
        }
    }
    public void displayBalance(){
        System.out.println("Current balance: $"+balance);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bal = scan.nextDouble();
        double amount = scan.nextDouble();
        BankAccount ba = new BankAccount(bal);
        ba.displayBalance();
        ba.deposit(amount);
        ba.withdraw(amount);
    }
}
