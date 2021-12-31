package com.example.bank_demo.controllers;

import com.example.bank_demo.models.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.bank_demo.services.TransactionService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions/{accountNumber}")
    public List<Transaction> getTransactions(@PathVariable("accountNumber") Integer accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
