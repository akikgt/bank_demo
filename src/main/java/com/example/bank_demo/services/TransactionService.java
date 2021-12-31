package com.example.bank_demo.services;

import com.example.bank_demo.models.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    private List<Transaction> transactions;

    public TransactionService() {
        transactions = List.of(
                Transaction
                        .builder()
                        .type("credit")
                        .date(new Date())
                        .accountNumber(1)
                        .currency("USD")
                        .amount(BigDecimal.valueOf(100.00))
                        .merchantName("acme")
                        .merchantLogo("images/acme-logo.png")
                        .build()
        );
    }

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return transactions.stream().filter(e -> e.accountNumber.equals(accountNumber)).toList();
    }
}
