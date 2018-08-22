package com.company;

import lombok.Data;

@Data
public class Account {
    private final long id;
    private String fio;
    private double amount;

    public Account(long id) {
        this.id = id;
    }

    public void addValue(double v) {
        this.amount += v;
    }

    public static void main (String[] args) {
        Account account1 = new Account(1);
        account1.setFio("Ivan");
        account1.setAmount(1500);

        System.out.println(account1.getFio());

        Account account2 = new Account(2);
        account2.setFio("Ivan2");
        account2.setAmount(1000);
    }
}
