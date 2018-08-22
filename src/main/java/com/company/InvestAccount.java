package com.company;

public class InvestAccount extends Account{
    public InvestAccount(int id) {
        super(id);
        System.out.println(amount);
    }

    @Override
    public void setAmount(double amount) {
        System.out.println("Set new amount = " + amount);
        this.amount += amount;
    }
}
