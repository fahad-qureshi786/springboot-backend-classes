package com.sibau.demo.services;

import com.sibau.demo.dao.ProductRepository;
import com.sibau.demo.dao.RatingRepository;
import com.sibau.demo.dto.ProductDto;
import com.sibau.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RatingRepository ratingRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<ProductDto> getProducts() {
        List<ProductDto> productDtoList = new ArrayList<>();
        List<Product> allProducts = productRepository.findAll();
        for (int i = 0; i < allProducts.size(); i++) {
            ProductDto productDto = new ProductDto();
            productDto.setId(allProducts.get(i).getId());
            productDto.setDescription(allProducts.get(i).getDescription());
            productDto.setPrice(allProducts.get(i).getPrice());
            productDto.setTitle(allProducts.get(i).getTitle());
            productDto.setImage(allProducts.get(i).getImage());
            productDto.setCategory(allProducts.get(i).getCategory());
            productDto.setDescription(allProducts.get(i).getDescription());
            productDto.setRating(ratingRepository.findByProductId(allProducts.get(i).getId()));
            productDtoList.add(productDto);
        }
        return productDtoList;
    }

}
