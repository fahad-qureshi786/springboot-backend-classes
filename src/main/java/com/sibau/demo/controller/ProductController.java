package com.sibau.demo.controller;

import com.sibau.demo.model.Product;
import com.sibau.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping(name = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * http://localhost:8081/products/
     * @return
     */
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}
