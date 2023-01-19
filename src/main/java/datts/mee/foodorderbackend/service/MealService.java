package datts.mee.foodorderbackend.service;

import datts.mee.foodorderbackend.model.Meal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MealService {
    List<Meal> getAllMeal();
    Meal addMeal(Meal meal);
    void deleteMeal(Long id);
    Meal updateMeal(Meal meal);
    Meal getMealById(Long id);
}
