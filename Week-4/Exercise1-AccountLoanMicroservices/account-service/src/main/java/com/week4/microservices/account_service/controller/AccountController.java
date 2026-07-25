package com.week4.microservices.account_service.controller;

import com.week4.microservices.account_service.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccount() {
        return new Account(1001, "John Smith", 50000.0);
    }
}