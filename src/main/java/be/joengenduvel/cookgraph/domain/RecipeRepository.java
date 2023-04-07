package be.joengenduvel.cookgraph.domain;

import java.util.List;

public interface RecipeRepository {
    List<Recipe> findAllRecipes();

    void save(Recipe recipe);
}
