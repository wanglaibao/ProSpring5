package com.laibao.prospring5.dependencyinjectionxml.repository;

import com.laibao.prospring5.dependencyinjectionxml.domain.Account;
import com.laibao.prospring5.dependencyinjectionxml.domain.Amount;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public interface TransferRepository {
    void transfer(Account accountA, Account accountB, Amount amount);
}
