package com.github.masoud91.dddc.domain;

public class CartItem {
    Item item;
    Integer count;

    public CartItem(Item item, Integer count) {
        this.item = item;
        this.count = count;
    }
}
