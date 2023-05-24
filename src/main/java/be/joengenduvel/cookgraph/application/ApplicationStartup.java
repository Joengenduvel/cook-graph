package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Ingredient;
import be.joengenduvel.cookgraph.domain.Product;
import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@AllArgsConstructor
public class ApplicationStartup implements InitializingBean {

    private final RecipeRepository recipeRepository;

    @Override
    public void afterPropertiesSet() {
        recipeRepository.deleteAllRecipes();
        Product celery = Product.builder()
                .productId(1L)
                .name("Celery")
                .build();

        Product ham = Product.builder()
                .productId(2L)
                .name("Ham")
                .build();

        Ingredient celeryIngredient = Ingredient.builder()
                .gramsQuantity(100)
                .mlQuantity(100)
                .amount(2)
                .product(celery)
                .build();

        Ingredient hamIngredient = Ingredient.builder()
                .gramsQuantity(50)
                .mlQuantity(50)
                .amount(1)
                .product(ham)
                .build();

        Recipe exampleRecipe1 = Recipe.builder()
                .id(1L)
                .name("First Recipe")
                .description("A very Simple recipe")
                .duration(Duration.ZERO)
                .ingredient(celeryIngredient)
                .ingredient(hamIngredient)
                .build();

        Recipe exampleRecipe2 = Recipe.builder()
                .id(2L)
                .name("Second Recipe")
                .description("A very Simple recipe")
                .duration(Duration.ZERO)
                .ingredient(hamIngredient)
                .build();

        Recipe exampleRecipe3 = Recipe.builder()
                .id(3L)
                .name("Third Recipe")
                .description("A very Simple recipe")
                .duration(Duration.ZERO)
                .ingredient(celeryIngredient)
                .build();

        Recipe exampleRecipe4 = Recipe.builder()
                .id(4L)
                .name("Forth Recipe")
                .description("A very Simple recipe")
                .duration(Duration.ZERO)
                .build();

        recipeRepository.save(exampleRecipe1);
        recipeRepository.save(exampleRecipe2);
        recipeRepository.save(exampleRecipe3);
        recipeRepository.save(exampleRecipe4);
    }
}
