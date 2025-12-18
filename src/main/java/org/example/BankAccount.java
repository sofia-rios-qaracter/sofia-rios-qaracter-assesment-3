package org.example;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public BankAccount(String accountNumber, String accountHolder){
        this(accountNumber, accountHolder, 0.0);
    }
    public BankAccount(String accountNumber){
        this(accountNumber, "Unknown");
    }
    public BankAccount(){
        this("00000000-A");
    }
}
