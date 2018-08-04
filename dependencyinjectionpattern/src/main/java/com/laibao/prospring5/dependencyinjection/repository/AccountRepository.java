package com.laibao.prospring5.dependencyinjection.repository;

import com.laibao.prospring5.dependencyinjection.domain.Account;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public interface AccountRepository {
    Account findByAccountId(Long accountId);
}
