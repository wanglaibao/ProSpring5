package com.laibao.prospring5.dependencyinjection.repository.impl;

import com.laibao.prospring5.dependencyinjection.domain.Account;
import com.laibao.prospring5.dependencyinjection.domain.Amount;
import com.laibao.prospring5.dependencyinjection.repository.TransferRepository;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public class JdbcTransferRepositoryImpl implements TransferRepository{

    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        System.out.println("Transfering amount from account A to B via JDBC implementation");
    }
}
