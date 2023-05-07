package com.sibau.demo.controller;

import com.sibau.demo.dto.ProductDto;
import com.sibau.demo.dto.RatingDto;
import com.sibau.demo.model.Product;
import com.sibau.demo.model.Rating;
import com.sibau.demo.services.ProductService;
import com.sibau.demo.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/saveRating")
    public ResponseEntity<?> saveProduct(@RequestBody RatingDto ratingDto){
         try{
             Rating savedRating = ratingService.saveRating(ratingDto);
             return ResponseEntity.ok().body(savedRating);
         }catch (Exception e){
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
         }
    }


}
