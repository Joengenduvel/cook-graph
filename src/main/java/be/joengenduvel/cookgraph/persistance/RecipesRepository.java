package be.joengenduvel.cookgraph.persistance;

import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class RecipesRepository implements RecipeRepository {


    private final RecipeNeo4jRepository recipeNeo4jRepository;

    @Override
    public List<Recipe> findAllRecipes() {
        return recipeNeo4jRepository.findAll().stream().map(r -> new Recipe(r.getRecipeId(), r.getTitle(), r.getDescription(), Duration.ZERO)).collect(Collectors.toList());
    }

    @Override
    public void save(Recipe recipe) {
        RecipeNode recipeNode = RecipeNode.builder()
                .recipeId(recipe.id())
                .title(recipe.title())
                .description(recipe.description())
                .build();
        recipeNeo4jRepository.save(recipeNode);
    }
}
