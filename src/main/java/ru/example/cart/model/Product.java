package ru.example.cart.model;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String name;
    private double basePrice;
    private int quantity;
    private double totalPrice;

    public Product(long id, String name, double basePrice, int quantity)
    {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }
}
