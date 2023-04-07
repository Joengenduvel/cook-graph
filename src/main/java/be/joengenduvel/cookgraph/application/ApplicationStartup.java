package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class ApplicationStartup implements InitializingBean {

    @Autowired
    public ApplicationStartup(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    private RecipeRepository recipeRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        recipeRepository.save(new Recipe("","", Duration.ZERO));
    }
}
