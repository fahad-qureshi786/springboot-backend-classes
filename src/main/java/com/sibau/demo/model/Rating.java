package com.sibau.demo.model;

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


}
