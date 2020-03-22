package ru.example.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.cart.model.Cart;
import ru.example.cart.model.Product;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartRestController {
    @GetMapping("/{userId}")
    public Cart getCart(@Valid @PathVariable long userId)
    {
        // For simplicity we are returning a hard coded value
        List<Product> products = new ArrayList<>();
        //p1
        Product p1 = new Product(1,"keyboard",250,2);
        p1.setTotalPrice(p1.getBasePrice()*p1.getQuantity());
        products.add(p1);

        //p2
        Product p2 = new Product(2,"mouse",150,2);
        p2.setTotalPrice(p2.getBasePrice()*p2.getQuantity());
        products.add(p2);

        //calculating total price
        double totalPrice=products.stream().mapToDouble(p->p.getTotalPrice()).sum();

        return new Cart(products.size(),totalPrice, products);

    }
}
