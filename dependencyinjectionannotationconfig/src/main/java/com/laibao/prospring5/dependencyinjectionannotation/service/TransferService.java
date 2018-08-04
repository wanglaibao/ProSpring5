package com.laibao.prospring5.dependencyinjectionannotation.service;


import com.laibao.prospring5.dependencyinjectionannotation.domain.Amount;

/**
 * @author laibao wang
 * @date 2018-08-05
 * @version 1.0
 */
public interface TransferService {
    void transferAmount(long accountAId, long accountBId, Amount amount);
}
