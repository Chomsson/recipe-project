package pm.spring.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.recipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
