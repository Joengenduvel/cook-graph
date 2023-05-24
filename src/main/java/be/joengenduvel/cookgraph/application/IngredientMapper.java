package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Ingredient;
import be.joengenduvel.cookgraph.persistance.IngredientRelation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IngredientMapper {
    IngredientRelation sourceToDestination(Ingredient ingredient);
    Ingredient destinationToSource(IngredientRelation ingredientRelation);
}
