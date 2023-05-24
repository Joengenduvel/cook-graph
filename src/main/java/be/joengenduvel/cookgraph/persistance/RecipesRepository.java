package be.joengenduvel.cookgraph.persistance;

import be.joengenduvel.cookgraph.application.RecipeMapper;
import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class RecipesRepository implements RecipeRepository {


    private final RecipeNeo4jRepository recipeNeo4jRepository;

    private final RecipeMapper recipeMapper;

    @Override
    public Page<Recipe> findAllRecipes(Pageable pageable) {
        return recipeNeo4jRepository.findAll(pageable).map(recipeMapper::destinationToSource);
    }

    @Override
    public void save(Recipe recipe) {
        recipeNeo4jRepository.save(recipeMapper.sourceToDestination(recipe));
    }

    @Override
    public void deleteAllRecipes() {
        recipeNeo4jRepository.deleteAll();
    }
}
