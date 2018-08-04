package com.laibao.prospring5.dependencyinjectionannotation.service.impl;


import com.laibao.prospring5.dependencyinjectionannotation.domain.Account;
import com.laibao.prospring5.dependencyinjectionannotation.domain.Amount;
import com.laibao.prospring5.dependencyinjectionannotation.repository.AccountRepository;
import com.laibao.prospring5.dependencyinjectionannotation.repository.TransferRepository;
import com.laibao.prospring5.dependencyinjectionannotation.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
@Service(value = "transferService")
public class TransferServiceImpl implements TransferService {

    @Autowired
    @Qualifier(value = "jpaAccountRepository")
    private AccountRepository accountRepository;

    @Autowired
    @Qualifier(value = "jpaTransferRepository")
    private TransferRepository transferRepository;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void setTransferRepository(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmount(long accountAId, long accountBId, Amount amount) {
        Account accountA = accountRepository.findByAccountId(accountAId);
        Account accountB = accountRepository.findByAccountId(accountBId);
        transferRepository.transfer(accountA, accountB, amount);
    }
}
