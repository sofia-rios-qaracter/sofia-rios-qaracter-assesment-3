package org.example;

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
        this("00000000");
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

    public double withdraw(double withdraw){
        this.balance -= Math.abs(withdraw);
        return balance;
    }

    public double deposit(double deposit){
        this.balance += Math.abs(deposit);

        return balance;
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
