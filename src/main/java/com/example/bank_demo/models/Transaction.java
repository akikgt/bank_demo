package com.example.bank_demo.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@Data
public class Transaction {
    public String type;
    public Date date;
    public Integer accountNumber;
    public String currency;
    public BigDecimal amount;
    public String merchantName;
    public String merchantLogo;
}
