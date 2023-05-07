package com.sibau.demo.controller;

import com.sibau.demo.dto.ProductDto;
import com.sibau.demo.model.Product;
import com.sibau.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<ProductDto> getProducts() {
        return productService.getProducts();
    }
    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }


}
