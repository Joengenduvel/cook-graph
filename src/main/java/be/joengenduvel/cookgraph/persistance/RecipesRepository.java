package be.joengenduvel.cookgraph.persistance;

import be.joengenduvel.cookgraph.application.RecipeMapper;
import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class RecipesRepository implements RecipeRepository {


    private final RecipeNeo4jRepository recipeNeo4jRepository;

    private final RecipeMapper recipeMapper;

    @Override
    public List<Recipe> findAllRecipes() {
        return recipeNeo4jRepository.findAll().stream().map(recipeMapper::destinationToSource).collect(Collectors.toList());
    }

    @Override
    public void save(Recipe recipe) {
        recipeNeo4jRepository.save(recipeMapper.sourceToDestination(recipe));
    }
}
