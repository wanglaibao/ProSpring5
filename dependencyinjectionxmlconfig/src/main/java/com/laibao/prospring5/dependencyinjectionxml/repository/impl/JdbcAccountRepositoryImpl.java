package com.laibao.prospring5.dependencyinjectionxml.repository.impl;


import com.laibao.prospring5.dependencyinjectionxml.domain.Account;
import com.laibao.prospring5.dependencyinjectionxml.domain.Amount;
import com.laibao.prospring5.dependencyinjectionxml.repository.AccountRepository;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public class JdbcAccountRepositoryImpl implements AccountRepository {

    @Override
    public Account findByAccountId(long accountId) {
        Account account = new Account();
        account.setAccountId(accountId);
        account.setName("金戈");
        Amount amount = new Amount();
        amount.setBalance(5000.0);
        account.setAmount(amount);
        return account;
    }

    private void populateCache(){
        System.out.println("Called populateCache() method");
    }
}
