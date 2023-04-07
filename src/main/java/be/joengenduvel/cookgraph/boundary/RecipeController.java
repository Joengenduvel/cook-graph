package be.joengenduvel.cookgraph.boundary;

import be.joengenduvel.cookgraph.domain.Recipe;
import be.joengenduvel.cookgraph.domain.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listRecipes(
            Model model,
            @PageableDefault(size = 1000) final Pageable pageable) {

        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Recipe 1", "The best first recipe", Duration.of(1, ChronoUnit.MINUTES)));
        recipes.add(new Recipe("Recipe 2", "The best second recipe", Duration.of(2, ChronoUnit.MINUTES)));

        recipes = recipeRepository.findAllRecipes();

        Page<Recipe> recipesPage = new PageImpl<>(recipes);

        model.addAttribute("recipesPage", recipesPage);

        int totalPages = recipesPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        return "index.html";
    }

}
