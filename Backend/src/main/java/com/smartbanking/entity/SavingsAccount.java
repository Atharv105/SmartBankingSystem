package com.smartbanking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "savings_account")
public class SavingsAccount extends Account{

//    Keyword	Purpose
//    private	Encapsulation
//    static	Shared across all instances
//    final	    Immutable constant


//    why static
//    Each object will have its own copy of interest rate
//    Waste of memory, and logically wrong.

    private static final BigDecimal interest_rate = new BigDecimal("0.04");

    @Override
    public BigDecimal calculateInterest() {
        return getBalance().multiply(interest_rate);
    }
}
