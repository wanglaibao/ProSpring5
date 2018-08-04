package com.laibao.prospring5.dependencyinjectionannotation.repository;

import com.laibao.prospring5.dependencyinjectionannotation.domain.Account;
import com.laibao.prospring5.dependencyinjectionannotation.domain.Amount;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public interface TransferRepository {
    void transfer(Account accountA, Account accountB, Amount amount);
}
