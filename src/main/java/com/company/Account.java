package com.company;

//import lombok.Data;

//@Data
public class Account {


    private static long count;
    private final long id;
    private String fio;
    protected double amount;


    public Account(long id) {
        this.id = id;
    }

    public Account() {
        this(0);
        System.out.println("Call def constructor");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Account.count = count;
    }

    public void addValue(double v) {
        this.amount += v;
    }

    public static void main(String[] args) {
        Account account1 = new Account(1);
        account1.setFio("Ivan");
        account1.setAmount(1500);

        System.out.println(account1.getFio());

        Account account2 = new Account(2);
        account2.setFio("Ivan2");
        account2.setAmount(1000);
    }
}
