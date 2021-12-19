package com.github.masoud91.dddc.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    void shouldCreateAMoney() {
        Money moneyOne = Money.from(80D, Currency.EURO);

        assertThat(moneyOne.getValue()).isEqualTo(80);
        assertThat(moneyOne.getCurrency()).isEqualTo(Currency.EURO);
    }

    @Test
    void shouldCompareToEqualMoney() {
        Money moneyOne = Money.from(80D, Currency.EURO);
        Money moneyTwo = Money.from(80D, Currency.EURO);

        assertThat(moneyOne.equals(moneyTwo)).isTrue();
    }

    @Test
    void shouldCompareToUnequalValueMoney() {
        Money moneyOne = Money.from(80D, Currency.EURO);
        Money moneyTwo = Money.from(60D, Currency.EURO);

        assertThat(moneyOne.equals(moneyTwo)).isFalse();
    }

    @Test
    void shouldCompareToUnequalCurrencyMoney() {
        Money moneyOne = Money.from(80D, Currency.EURO);
        Money moneyTwo = Money.from(80D, Currency.DOLLAR);

        assertThat(moneyOne.equals(moneyTwo)).isFalse();
    }

    @Test
    void shouldAddTwoMonies() throws Exception {
        Money moneyOne = Money.from(80D, Currency.EURO);
        Money moneyTwo = Money.from(60D, Currency.EURO);

        Money result = moneyOne.add(moneyTwo);
        Money expected = Money.from(140D, Currency.EURO);

        assertThat(result.equals(expected)).isTrue();
    }

}
