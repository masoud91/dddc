package com.github.masoud91.dddc.domain;

import java.security.InvalidParameterException;
import java.util.Objects;

public class Money {

    private final Double value;
    private final Currency currency;

    private Money(Double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public static Money from(Double value, Currency currency) {
        if (value < 0) {
            throw new InvalidParameterException("value should be grater than zero");
        }
        return new Money(value, currency);
    }

    public Money add(Money money) throws Exception {
        if (!money.getCurrency().equals(this.currency)) {
            throw new Exception("you can only add monies from same currency");
        }

        return new Money(this.getValue() + money.getValue(), this.getCurrency());
    }

    public boolean equals(Money money) {
        if (money == null)
            return false;
        return (Objects.equals(money.value, this.getValue()) && money.currency == this.getCurrency());
    }

    public Double getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }
}
