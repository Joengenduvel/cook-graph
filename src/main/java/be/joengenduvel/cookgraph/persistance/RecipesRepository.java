package be.joengenduvel.cookgraph.persistance;

import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class RecipesRepository implements RecipeRepository {


    private final RecipeNeo4jRepository recipeNeo4jRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Recipe> findAllRecipes() {
        return recipeNeo4jRepository.findAll().stream().map(r -> modelMapper.map(r,Recipe.RecipeBuilder.class).build()).collect(Collectors.toList());
    }

    @Override
    public void save(Recipe recipe) {
        RecipeNode recipeNode = modelMapper.map(recipe, RecipeNode.RecipeNodeBuilder.class).build();
        recipeNeo4jRepository.save(recipeNode);
    }
}
