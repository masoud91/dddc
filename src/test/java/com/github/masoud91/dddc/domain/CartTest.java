package com.github.masoud91.dddc.domain;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class CartTest {

    @Test
    void shouldAddToCart() throws NotEnoughItemAvailableException {
        Item itemOne = new Item(1L, "Vitamin D", Money.from(10D, Currency.DOLLAR), 5);
        Item itemTwo = new Item(2L, "Vitamin C", Money.from(10D, Currency.DOLLAR), 10);

        Cart cart = new Cart(100L);
        cart.addItem(new CartItem(itemOne, 1));
        cart.addItem(new CartItem(itemTwo, 3));

        assertThat(cart.getCartId()).isEqualTo(100L);
        assertThat(cart.getItems().size()).isEqualTo(2);
    }

    @Test
    void shouldThrowExceptionDueToNotEnoughItem() {
        Item itemOne = new Item(1L, "Vitamin D", Money.from(10D, Currency.DOLLAR), 4);

        Cart cart = new Cart(100L);

        assertThatExceptionOfType(NotEnoughItemAvailableException.class)
                .isThrownBy(() -> cart.addItem(new CartItem(itemOne, 6)));
    }

}
