package pm.spring.recipeproject.services;
/* created by PM
  at 17.11.2020 */

import org.springframework.stereotype.Service;
import pm.spring.recipeproject.domain.Recipe;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
}
