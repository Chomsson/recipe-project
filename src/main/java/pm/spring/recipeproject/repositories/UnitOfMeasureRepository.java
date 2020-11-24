package pm.spring.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
