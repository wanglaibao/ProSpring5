package com.laibao.prospring5.dependencyinjection.service.impl;

import com.laibao.prospring5.dependencyinjection.domain.Account;
import com.laibao.prospring5.dependencyinjection.domain.Amount;
import com.laibao.prospring5.dependencyinjection.repository.AccountRepository;
import com.laibao.prospring5.dependencyinjection.repository.TransferRepository;
import com.laibao.prospring5.dependencyinjection.service.TransferService;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */

public class TransferServiceImpl implements TransferService {

    private final AccountRepository accountRepository;

    private final TransferRepository transferRepository;

    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmount(long accountAId, long accountBId, Amount amount) {
        Account accountA = accountRepository.findByAccountId(accountAId);
        Account accountB = accountRepository.findByAccountId(accountBId);
        transferRepository.transfer(accountA, accountB, amount);
    }
}
