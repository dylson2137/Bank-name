package pl.bankapp;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        BankAccount adam = new BankAccount("Adam");
        BankAccount jan = new BankAccount("Jan");

        adam.deposit(200);
        jan.deposit(500);

        bank.addAccount(adam);
        bank.addAccount(jan);

        bank.showAccounts();
    }
}
