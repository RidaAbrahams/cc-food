package za.co.cc.food.control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.co.cc.food.entity.Food;
import za.co.cc.food.entity.FoodRepository;
import za.co.cc.food.entity.FoodRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class FoodServiceTest {

    @InjectMocks
    FoodService service;

    @Mock
    FoodRepository repository;

    FoodRequest request;

    @BeforeEach
    void init() {
        request = new FoodRequest();
        request.setFoodName("Banana");
        request.setServingSize(100);
        request.setServingUnit("g");
        request.setCalories(91);
        request.setProtein(1.25);
        request.setCarbohydrate(18.75);
        request.setFat(0.25);
        request.setDietaryFibre(1.8);
        request.setSodium(1);
    }

    @Test
    void shouldAddFoodWhenFoodRequestIsProvided() {
        Food food = service.addFood(request);
        assertEquals("Banana", food.getFoodName());
        assertEquals(100, food.getServingSize());
        assertEquals("g", food.getServingUnit());
        assertEquals(91, food.getCalories());
        assertEquals(1.25, food.getProtein());
        assertEquals(18.75, food.getCarbohydrate());
        assertEquals(0.25, food.getFat());
        assertEquals(1.8, food.getDietaryFibre());
        assertEquals(1, food.getSodium());
        verify(repository, times(1)).persist(any(Food.class));
    }

    @Test
    void findById() {
    }
}
