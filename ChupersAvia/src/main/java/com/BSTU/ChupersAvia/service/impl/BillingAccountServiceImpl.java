package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import com.BSTU.ChupersAvia.repository.BillingAccountRepository;
import com.BSTU.ChupersAvia.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingAccountServiceImpl implements BillingAccountService {
    private final BillingAccountRepository billingAccountRepository;

    @Autowired
    public BillingAccountServiceImpl(BillingAccountRepository billingAccountRepository) {
        this.billingAccountRepository = billingAccountRepository;
    }

    @Override
    public BillingAccount save(BillingAccount billingAccount) {
        billingAccountRepository.save(billingAccount);
        return billingAccount;
    }

    @Override
    public List<BillingAccount> getAllBillingAccount() {
       return billingAccountRepository.findAllBy();
    }

    @Override
    public BillingAccount getBillingAccountById(Long id) {
       return billingAccountRepository.findBillingAccountByBillingAccountId(id);
    }

    @Override
    public BillingAccount getBillingAccountByUserId(Long userId) {
        return billingAccountRepository.findByUsers_UserId(userId);
    }
}
