package com.github.masoud91.dddc.domain;

import java.util.HashSet;
import java.util.Set;

public class Cart {

    private final Long cartId;
    private final Set<CartItem> items = new HashSet<>();

    public Cart(Long cartId) {
        this.cartId = cartId;
    }

    public Long getCartId() {
        return cartId;
    }

    public Set<CartItem> getItems() {
        return items;
    }

    public void addItem(CartItem cartItem) throws NotEnoughItemAvailableException {
        if (cartItem.count > cartItem.item.getStockCount()) {
            throw new NotEnoughItemAvailableException();
        }
        items.add(cartItem);
    }

}
