package com.learning.atm;

public class Account {
    private String numNo;
    private String name;
    private double money;
    private double limit;
    private String password;
    public Account() {}
    public Account(String numNo, String name, double money, double limit, String password) {
        this.numNo = numNo;
        this.name = name;
        this.money = money;
        this.limit = limit;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumNo() {
        return numNo;
    }

    public void setNumNo(String numNo) {
        this.numNo = numNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
