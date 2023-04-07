package be.joengenduvel.cookgraph.persistance;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Builder
public class RecipeNode {

    @Id
    @GeneratedValue
    private long id;
}
