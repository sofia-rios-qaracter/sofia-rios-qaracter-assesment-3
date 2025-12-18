package org.example;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public SavingsAccount(String accountNumber, String accountHolder, double balance){
        this(accountNumber, accountHolder, balance, 0.0);
    }

    public SavingsAccount(String accountNumber, String accountHolder){
        this(accountNumber, accountHolder, 0.0);
    }
    public SavingsAccount(String accountNumber){
        this(accountNumber, "Unknown");
    }
    public SavingsAccount(){
        this("00000000-S");
    }

    public double applyMonthlyInterest(){
        this.deposit(this.getBalance()*interestRate);

        return this.getBalance();
    }

    @Override
    public String getAccountInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getAccountInfo());
        sb.append("Interest rate: ").append(this.interestRate).append("\n");

        return sb.toString();
    }
}
