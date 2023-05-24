package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Ingredient;
import be.joengenduvel.cookgraph.persistance.IngredientRelation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IngredientMapper {
    @Mapping(target = "ingredientId", source = "ingredientId")
    IngredientRelation sourceToDestination(Ingredient ingredient);

    @Mapping(target = "ingredientId", source = "ingredientId")
    Ingredient destinationToSource(IngredientRelation ingredientRelation);
}
