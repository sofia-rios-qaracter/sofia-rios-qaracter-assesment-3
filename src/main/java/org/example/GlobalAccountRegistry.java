package org.example;

import java.util.ArrayList;
import java.util.List;

public class GlobalAccountRegistry {
    List<BankAccount> accounts;

    public void GlobalAccoutRegistry(){
        this.accounts = new ArrayList<>();
    }

    public boolean addAccount(BankAccount account){
        return this.accounts.add(account);
    }

    public BankAccount findAccount(String number){
        // Find any
        return this.accounts.isEmpty() ? null : this.accounts.stream().filter(account -> account.getAccountNumber() == number).toList().get(0);
    }

    public double getTotalBalance(){
        double balance = 0.0;

        for(BankAccount account: accounts){
            balance += account.getBalance();
        }

        return balance;
    }

    public List<BankAccount> getAccountsWithBalanceGreaterThan(double balance){
        return this.accounts.stream().filter(account -> account.getBalance()>balance).toList();
    }
}
