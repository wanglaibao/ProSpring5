package com.laibao.prospring5.dependencyinjectionannotation.repository.impl;


import com.laibao.prospring5.dependencyinjectionannotation.domain.Account;
import com.laibao.prospring5.dependencyinjectionannotation.domain.Amount;
import com.laibao.prospring5.dependencyinjectionannotation.repository.AccountRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
@Repository(value = "jdbcAccountRepository")
public class JdbcAccountRepositoryImpl implements AccountRepository {

    @Override
    public Account findByAccountId(long accountId) {
        Account account = new Account();
        account.setAccountId(accountId);
        account.setName("金戈");
        Amount amount = new Amount();
        amount.setBalance(6000.0);
        account.setAmount(amount);
        return account;
    }

    @PostConstruct
    private void populateCache(){
        System.out.println("Called populateCache() method");
    }
}
