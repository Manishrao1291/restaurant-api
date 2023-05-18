package com.geekster.RestaurantAPI.controller;


import com.geekster.RestaurantAPI.model.Food;
import com.geekster.RestaurantAPI.service.FoodService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/restaurants/{restaurantId}/menu")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> getAllFoodByRestaurantId(@PathVariable Long restaurantId) {
        List<Food> foodList = foodService.getAllFoodByRestaurantId(restaurantId);
        return ResponseEntity.ok(foodList);
    }

    @PostMapping
    public ResponseEntity<Food> createFood(@PathVariable Long restaurantId, @Valid @RequestBody Food food) {
        Food createdFood = foodService.createFood(restaurantId, food);
        return ResponseEntity.created(URI.create("/restaurants/" + restaurantId + "/menu/" + createdFood.getId())).body(createdFood);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable Long restaurantId, @PathVariable Long id, @Valid @RequestBody Food food) {
        Food updatedFood = foodService.updateFood(restaurantId, id, food);
        return ResponseEntity.ok(updatedFood);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable Long restaurantId, @PathVariable Long id) {
        foodService.deleteFoodById(restaurantId, id);
        return ResponseEntity.noContent().build();
    }
}
