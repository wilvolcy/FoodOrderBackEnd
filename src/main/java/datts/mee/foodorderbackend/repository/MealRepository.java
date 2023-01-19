package datts.mee.foodorderbackend.repository;

import datts.mee.foodorderbackend.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal,Long> {
}
