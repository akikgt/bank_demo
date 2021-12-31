package com.example.bank_demo.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    public void test_findAllByAccountNumber() {
        var result = transactionService.findAllByAccountNumber(1);
        assertEquals(1, result.size());
    }

}