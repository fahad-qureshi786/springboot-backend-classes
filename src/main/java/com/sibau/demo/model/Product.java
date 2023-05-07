package com.sibau.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Table(name = "product")
@Entity
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

}
