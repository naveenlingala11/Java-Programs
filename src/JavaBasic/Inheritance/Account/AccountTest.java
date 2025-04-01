package JavaBasic.Inheritance.Account;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", 1000, 5);
        sa.displayBalance();
        sa.addInterest();
        sa.withdraw(500);
        sa.displayBalance();

        System.out.println("------------------");

        CurrentAccount ca = new CurrentAccount("CA54321", 2000, 500);
        ca.displayBalance();
        ca.withdraw(2200);
        ca.displayBalance();
        ca.withdraw(400);
    }
}
