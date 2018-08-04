package com.laibao.prospring5.dependencyinjectionxml.repository.impl;


import com.laibao.prospring5.dependencyinjectionxml.domain.Account;
import com.laibao.prospring5.dependencyinjectionxml.domain.Amount;
import com.laibao.prospring5.dependencyinjectionxml.repository.TransferRepository;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public class JdbcTransferRepositoryImpl implements TransferRepository {

    @Override
    public void transfer(Account accountC, Account accountD, Amount amount) {
        System.out.println("Transfering amount from account C to D via JDBC implementation");
    }
}
