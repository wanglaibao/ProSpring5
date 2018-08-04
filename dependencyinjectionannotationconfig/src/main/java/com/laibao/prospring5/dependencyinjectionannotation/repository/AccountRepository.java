package com.laibao.prospring5.dependencyinjectionannotation.repository;

import com.laibao.prospring5.dependencyinjectionannotation.domain.Account;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public interface AccountRepository {
    Account findByAccountId(long accountId);
}
