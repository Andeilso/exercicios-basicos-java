package model.entities;

import model.exception.InsufficientFundsException;
import model.exception.WithdrawLimitException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer number){
        this.number = number;
    }

    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getWithdrawLimit(){
        return this.withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;
    }

    public void withdraw(Double amount) throws WithdrawLimitException, InsufficientFundsException{
        if(amount > getWithdrawLimit()){
            throw new WithdrawLimitException("The amount exceeds withdraw limit");
        }
        if(amount > getBalance()){
            throw new InsufficientFundsException("Insufficient funds for withdraw");
        }

        this.balance -= amount;
    }
}
