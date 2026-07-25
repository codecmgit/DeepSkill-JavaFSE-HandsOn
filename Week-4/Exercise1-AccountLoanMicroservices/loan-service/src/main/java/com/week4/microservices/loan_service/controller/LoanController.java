package com.week4.microservices.loan_service.controller;

import com.week4.microservices.loan_service.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public Loan getLoan() {
        return new Loan(
                2001,
                "Home Loan",
                1500000.0
        );

    }
}