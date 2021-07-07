package com.microgateway.product.controller;

import com.microgateway.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/api/v1/product")
    public List<Product> getAll() {
        return Arrays.asList(new Product("Fluffy", 5l),
                new Product("Bob", 6l),
                new Product("Cupcake", 11l));
    }
}
