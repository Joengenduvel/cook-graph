package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@AllArgsConstructor
public class ApplicationStartup implements InitializingBean {

    private final RecipeRepository recipeRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        Recipe exampleRecipe = new Recipe(1, "First Recipe", "A very Simple recipe", Duration.ZERO);
        recipeRepository.save(exampleRecipe);
    }
}
