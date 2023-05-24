package be.joengenduvel.cookgraph.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.time.Duration;
import java.util.Set;

@Builder
@Getter
public class Recipe {
    Long id;
    String name;
    String description;
    Duration duration;
    @Singular
    Set<Ingredient> ingredients;
}
