package com.laibao.prospring5.dependencyinjection.repository;

import com.laibao.prospring5.dependencyinjection.domain.Account;
import com.laibao.prospring5.dependencyinjection.domain.Amount;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public interface TransferRepository {
    void transfer(Account accountA, Account accountB, Amount amount);
}
