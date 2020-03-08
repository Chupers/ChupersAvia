package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import com.BSTU.ChupersAvia.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/billingAccount")
public class BillingAccountController {
    private final BillingAccountService billingAccountService;

    @Autowired
    public BillingAccountController(BillingAccountService billingAccountService) {
        this.billingAccountService = billingAccountService;
    }

    @GetMapping("/getAll")
    public List<BillingAccount> getAllBillingAccount(){
        return billingAccountService.getAllBillingAccount();
    }
    @PostMapping("/save")
    public BillingAccount saveBillingAccount(@RequestBody BillingAccount billingAccount){
        return billingAccountService.save(billingAccount);
    }
}
