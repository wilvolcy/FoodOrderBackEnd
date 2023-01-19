package datts.mee.foodorderbackend.controller;

import datts.mee.foodorderbackend.model.Meal;
import datts.mee.foodorderbackend.service.MealService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meals")
@CrossOrigin
public class MealController {
    private final  MealService mealService;

    public MealController (MealService mealService){
        this.mealService = mealService;
    }
    @PostMapping()
    public ResponseEntity<Meal> addMeal(@RequestBody Meal meal){
        return new ResponseEntity<>(mealService.addMeal(meal), HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<Meal>> getMeals(){
        return new ResponseEntity<>(mealService.getAllMeal(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Meal> getMeal(@PathVariable("id") Long id){
        return new ResponseEntity<>(mealService.getMealById(id),HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Meal> updateMeal(@RequestBody Meal meal){
        return ResponseEntity.ok(mealService.updateMeal(meal));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteMeal(@PathVariable Long id){
        mealService.deleteMeal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
