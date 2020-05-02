package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.BillingAccount;

import java.util.List;

public interface BillingAccountService {
    BillingAccount save(BillingAccount billingAccount);
    List<BillingAccount> getAllBillingAccount();
    BillingAccount getBillingAccountById(Long id);
    BillingAccount getBillingAccountByUserId(Long userId);
}
