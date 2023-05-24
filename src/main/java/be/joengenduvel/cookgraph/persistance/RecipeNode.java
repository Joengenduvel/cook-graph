package be.joengenduvel.cookgraph.persistance;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.Duration;
import java.util.Set;


@Node("Recipe")
@Builder
@Getter
public class RecipeNode {

    @Id
    private Long recipeId;

    private String name;
    private String description;
    private Duration duration;

    @Singular
    @Relationship(direction = Relationship.Direction.OUTGOING, type = "HAS_INGREDIENT")
    Set<IngredientRelation> ingredients;
}
