package ku.cs.restaurant.controller;

import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurants() {
        return service.getAll();
    }

    @GetMapping("/restaurant/{id}")
    public Restaurant getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @GetMapping("/restaurant/name/{name}")
    public Restaurant getRestaurantByName(@PathVariable String name) {
        return service.getRestaurantByName(name);
    }

    @GetMapping("/restaurant/location/{location}")
    public List<Restaurant> getRestaurantByLocation(@PathVariable String location) {
        return service.getRestaurantByLocation(location);
    }

//    @GetMapping("/restaurant")
//    public String getAllRestaurants() {
//        return "All restaurants";
//    }

    @PutMapping("/restaurant")
    public Restaurant update(@RequestBody Restaurant restaurant) {
        return service.update(restaurant);
    }

    @DeleteMapping("/restaurant/{id}")
    public Restaurant delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @PostMapping("/restaurant")
    public Restaurant create(@RequestBody Restaurant restaurant) {
        return service.create(restaurant);
    }
}
