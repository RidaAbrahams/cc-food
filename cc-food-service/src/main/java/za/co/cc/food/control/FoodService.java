package za.co.cc.food.control;

import za.co.cc.food.entity.Food;
import za.co.cc.food.entity.FoodRepository;
import za.co.cc.food.entity.FoodRequest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class FoodService {

    @Inject
    FoodRepository repository;

    public Food addFood(FoodRequest foodRequest) {
        Food food = FoodRequest.newFood(foodRequest);
        repository.persist(food);
        return food;
    }

    public List<Food> findAll() {
        return repository.findAll();
    }
}
