package com.github.masoud91.dddc.domain;

public class Item {
    Long Id;
    String name;
    Money price;
    Integer stockCount;

    public Item(Long id, String name, Money price, Integer stockCount) {
        Id = id;
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    public Integer getStockCount() {
        return stockCount;
    }
}
