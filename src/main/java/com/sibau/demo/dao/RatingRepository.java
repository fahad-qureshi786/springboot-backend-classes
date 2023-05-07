package com.sibau.demo.dao;

import com.sibau.demo.model.Product;
import com.sibau.demo.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    @Query("select rating from Rating rating where rating.product.id=?1")
    Rating findByProductId(long id);


}
