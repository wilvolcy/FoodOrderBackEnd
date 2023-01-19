package datts.mee.foodorderbackend.service;

import datts.mee.foodorderbackend.model.Meal;
import datts.mee.foodorderbackend.repository.MealRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl implements MealService{
    public MealRepository mealRepository;
    public  MealServiceImpl(MealRepository mealRepository){
        this.mealRepository = mealRepository;
    }
    @Override
    public List<Meal> getAllMeal() {
        return mealRepository.findAll();
    }

    @Override
    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public void deleteMeal(Long id) {
        mealRepository.deleteById(id);
    }

    @Override
    public Meal updateMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public Meal getMealById(Long id) {
        return mealRepository.findById(id).orElseThrow(()->{
            throw new RuntimeException("No Id Found ");
        });
    }
}
