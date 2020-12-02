package pm.spring.recipeproject.services;
/* created by PM
  at 17.11.2020 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pm.spring.recipeproject.domain.Recipe;
import pm.spring.recipeproject.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("Im in the service now");

        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }
}
