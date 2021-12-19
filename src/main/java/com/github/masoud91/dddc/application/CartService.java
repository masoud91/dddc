package com.github.masoud91.dddc.application;

import com.github.masoud91.dddc.domain.*;

import java.util.HashSet;
import java.util.Set;

public class CartService {

    public void addToCart(Long customerId, Long itemId, Integer count) throws NotEnoughItemAvailableException {
        // assume we fetch from storage
        // cartRepository.findById(customerId)
        Cart cart = new Cart(100L);

        // assume we fetch from storage
        // itemRepository.findById(itemId)
        Item itemOne = new Item(1L, "Vitamin D", Money.from(10D, Currency.DOLLAR), 10);

        CartItem cartItem = new CartItem(itemOne, count);
        // check if count <= stockCount
        cart.addItem(cartItem);

        // repository.save(cart);
    }

}
