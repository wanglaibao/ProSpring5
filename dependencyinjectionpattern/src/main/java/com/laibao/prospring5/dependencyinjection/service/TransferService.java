package com.laibao.prospring5.dependencyinjection.service;

import com.laibao.prospring5.dependencyinjection.domain.Amount;

/**
 * @author laibao wang
 * @date 2018-08-04
 * @version 1.0
 */
public interface TransferService {
    void transferAmount(long accountAId, long accountBId, Amount amount);
}
