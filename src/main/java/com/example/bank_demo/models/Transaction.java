package com.example.bank_demo.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Transaction {
    public String type;
    public LocalDateTime date;
    public Integer accountNumber;
    public String currency;
    public BigDecimal amount;
    public String merchantName;
    public String merchantLogo;

    public Transaction(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
