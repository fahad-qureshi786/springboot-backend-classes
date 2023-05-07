package com.sibau.demo.services;

import com.sibau.demo.dao.ProductRepository;
import com.sibau.demo.dao.RatingRepository;
import com.sibau.demo.dto.ProductDto;
import com.sibau.demo.dto.RatingDto;
import com.sibau.demo.exception.ProductNotFoundException;
import com.sibau.demo.model.Product;
import com.sibau.demo.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private ProductRepository productRepository;

    public Rating saveRating(RatingDto ratingDto) throws ProductNotFoundException {
        Rating rating = new Rating();
        rating.setRate(ratingDto.getRate());
        rating.setCount(ratingDto.getCount());
        Product foundProduct = productRepository.findById(ratingDto.getProductId()).orElseThrow(() -> new ProductNotFoundException("Product with id " + ratingDto.getProductId() + " not found"));
        rating.setProduct(foundProduct);

        return ratingRepository.save(rating);
    }

}
