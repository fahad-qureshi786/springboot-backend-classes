package com.sibau.demo.services;

import com.sibau.demo.dao.ProductRepository;
import com.sibau.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

}
