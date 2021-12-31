package com.example.bank_demo.services;

import com.example.bank_demo.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    private List<Transaction> transactions = new ArrayList<>();

    public TransactionService() {
        transactions.add(new Transaction(1));
        transactions.add(new Transaction(1));
        transactions.add(new Transaction(1));
    }

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return transactions.stream().filter(e -> e.accountNumber.equals(accountNumber)).toList();
    }
}
