package org.example;

import exceptions.InsufficientFundsException;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    // private static int quantity = 1; Futura posible implementacion

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
        this("00000000-R");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return this.accountNumber;
    }

    private double setBalance(double balanceToChange) throws InsufficientFundsException{
        if(this.balance + balanceToChange < 0) throw new InsufficientFundsException();

        this.balance += balanceToChange;

        return this.balance;
    }

    public double withdraw(double withdraw){
        double balanceBefore = 0.0;

        try{
            balanceBefore = this.setBalance(-Math.abs(withdraw));
        } catch (InsufficientFundsException e){
            System.out.println(e.toString());
        }

        return balanceBefore;
    }

    public double deposit(double deposit){
        return this.setBalance(Math.abs(deposit));
    }

    public double getBalance(){
        return this.balance;
    }

    public double transferTo(double quantity, BankAccount accountToTransfer){
        this.withdraw(quantity);
        accountToTransfer.deposit(quantity);

        return quantity;
    }

    public String getAccountInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Account number: ").append(this.accountNumber).append("\n");
        sb.append("Account holder: ").append(this.accountHolder).append("\n");
        sb.append("Balance: ").append(this.balance).append("\n");

        return sb.toString();
    }
}
