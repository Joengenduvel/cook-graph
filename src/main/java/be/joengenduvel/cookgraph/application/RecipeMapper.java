package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.persistance.RecipeNode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    @Mapping(target = "recipeId", source = "id")
    RecipeNode sourceToDestination(Recipe recipe);

    @Mapping(target = "id", source = "recipeId")
    Recipe destinationToSource(RecipeNode recipeNode);
}
