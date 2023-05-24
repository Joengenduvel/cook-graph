package be.joengenduvel.cookgraph.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository {
    List<Recipe> findAllRecipes();

    void save(Recipe recipe);
}
