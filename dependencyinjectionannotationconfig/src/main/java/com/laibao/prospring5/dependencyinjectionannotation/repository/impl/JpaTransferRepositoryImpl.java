package com.laibao.prospring5.dependencyinjectionannotation.repository.impl;

import com.laibao.prospring5.dependencyinjectionannotation.domain.Account;
import com.laibao.prospring5.dependencyinjectionannotation.domain.Amount;
import com.laibao.prospring5.dependencyinjectionannotation.repository.TransferRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
@Repository(value = "jpaTransferRepository")
public class JpaTransferRepositoryImpl implements TransferRepository{

    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        System.out.println("Transfering amount from account C to D via JPA implementation");
    }
}
