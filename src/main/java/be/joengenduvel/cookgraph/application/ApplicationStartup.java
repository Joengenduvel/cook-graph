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
        Product celery = Product.builder()
                .productId(1L)
                .name("Celery")
                .build();

        Product ham = Product.builder()
                .productId(2L)
                .name("Ham")
                .build();

        Ingredient celeryIngredient = Ingredient.builder()
//                .ingredientId(0L)
                .gramsQuantity(100)
                .mlQuantity(100)
                .amount(2)
                .product(celery)
                .build();

        Ingredient hamIngredient = Ingredient.builder()
//                .ingredientId(1L)
                .gramsQuantity(50)
                .mlQuantity(50)
                .amount(1)
                .product(ham)
                .build();

        Recipe exampleRecipe = Recipe.builder()
                .id(1L)
                .name("First Recipe")
                .description("A very Simple recipe")
                .duration(Duration.ZERO)
                .ingredient(celeryIngredient)
                .ingredient(hamIngredient)
                .build();
        recipeRepository.save(exampleRecipe);
    }
}
