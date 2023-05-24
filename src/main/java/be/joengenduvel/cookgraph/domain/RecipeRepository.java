package be.joengenduvel.cookgraph.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository {
    Page<Recipe> findAllRecipes(Pageable pageable);

    void save(Recipe recipe);

    void deleteAllRecipes();
}
