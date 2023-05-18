package com.geekster.RestaurantAPI.repository;


import com.geekster.RestaurantAPI.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByRestaurantId(Long restaurantId);

    Optional<Food> findByIdAndRestaurantId(Long id, Long restaurantId);

}
