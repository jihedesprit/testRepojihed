package com.example.testjihedbouabid.Service;

import com.example.testjihedbouabid.DAO.Entities.Menu;
import com.example.testjihedbouabid.DAO.Entities.Restaurant;
import com.example.testjihedbouabid.Repository.MenuRepository;
import com.example.testjihedbouabid.Repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService{
    RestaurantRepository restaurantRepository;
    MenuRepository menuRepository;
    @Override
    public Restaurant ajouterRestaurantEtMenusAssocie(Restaurant resto){


        Restaurant saveRestaurant = restaurantRepository.save(resto);
        for(Menu menu : resto.getMenus()){
            menuRepository.save(menu);
        }
        return resto;
    }
}
