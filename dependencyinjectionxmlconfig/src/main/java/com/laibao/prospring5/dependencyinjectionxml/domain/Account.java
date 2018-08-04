package com.laibao.prospring5.dependencyinjectionxml.domain;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public class Account {
    private long accountId;
    private String name;
    private Amount amount;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
