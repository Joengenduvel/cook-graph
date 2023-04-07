package be.joengenduvel.cookgraph.persistance;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Builder
@Getter
public class RecipeNode {

    @Id
    private long recipeId;
    private String title;
    private String description;
}
