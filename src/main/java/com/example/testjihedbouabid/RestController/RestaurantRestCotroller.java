package com.example.testjihedbouabid.RestController;

import com.example.testjihedbouabid.DAO.Entities.Restaurant;
import com.example.testjihedbouabid.Service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("restaurant")
public class RestaurantRestCotroller {
    RestaurantService restaurantService;
    @PostMapping("addRestaurant")
    public ResponseEntity<Restaurant> addResto(@RequestBody Restaurant resto) {
        Restaurant saveRestaurant = restaurantService.ajouterRestaurantEtMenusAssocie(resto);
        return  new ResponseEntity<>(saveRestaurant , HttpStatus.CREATED);
    }

}
