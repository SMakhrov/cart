package ru.example.cart.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Cart {
    private int totaltems;
    private double totalPrice;
    List<Product> products;
}
