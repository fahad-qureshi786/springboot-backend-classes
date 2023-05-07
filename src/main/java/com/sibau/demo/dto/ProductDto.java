package com.sibau.demo.dto;

import com.sibau.demo.model.Rating;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    private Rating rating;

}
