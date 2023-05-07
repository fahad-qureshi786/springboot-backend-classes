package com.sibau.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
public class RatingDto {
    private long count;
    private double rate;
    private Long productId;

}
