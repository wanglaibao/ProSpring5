package com.laibao.prospring5.dependencyinjectionxml.repository;

import com.laibao.prospring5.dependencyinjectionxml.domain.Account;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public interface AccountRepository {
    Account findByAccountId(long accountId);
}
