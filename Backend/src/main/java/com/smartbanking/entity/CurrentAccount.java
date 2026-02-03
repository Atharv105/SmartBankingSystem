package com.smartbanking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "current_account")
public class CurrentAccount  extends Account{

    private static final BigDecimal overdraft_limit = new BigDecimal("5000");

    @Override
    public BigDecimal calculateInterest() {
        return BigDecimal.ZERO;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        BigDecimal newBalance = getBalance().subtract(amount);

        if(newBalance.compareTo(overdraft_limit.negate()) < 0){
            throw new IllegalArgumentException("Overdraft limit exceed");
        }
        setBalance(newBalance);
    }
}
