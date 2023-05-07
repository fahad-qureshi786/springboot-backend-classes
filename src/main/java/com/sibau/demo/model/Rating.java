package com.sibau.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Table(name = "rating")
@Entity
@Getter
@Setter
@ToString
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
   private long count;
   private double rate;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;

}
