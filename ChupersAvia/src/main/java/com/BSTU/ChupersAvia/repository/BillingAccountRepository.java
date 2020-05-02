package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingAccountRepository extends CrudRepository<BillingAccount,Long> {
    List<BillingAccount> findAllBy();
    BillingAccount findBillingAccountByBillingAccountId(Long id);
    BillingAccount findByUsers_UserId(Long userId);
}
