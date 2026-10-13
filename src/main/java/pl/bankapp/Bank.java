package pl.bankapp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(
                    account.getOwner() + ": " +
                            account.getBalance() + " PLN"
            );
        }
    }
}