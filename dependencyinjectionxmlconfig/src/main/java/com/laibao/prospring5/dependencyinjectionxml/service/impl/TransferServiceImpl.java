package com.laibao.prospring5.dependencyinjectionxml.service.impl;


import com.laibao.prospring5.dependencyinjectionxml.domain.Account;
import com.laibao.prospring5.dependencyinjectionxml.domain.Amount;
import com.laibao.prospring5.dependencyinjectionxml.repository.AccountRepository;
import com.laibao.prospring5.dependencyinjectionxml.repository.TransferRepository;
import com.laibao.prospring5.dependencyinjectionxml.service.TransferService;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */

public class TransferServiceImpl implements TransferService {

    private  AccountRepository accountRepository;

    private  TransferRepository transferRepository;

    public TransferServiceImpl() {
    }

    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

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
