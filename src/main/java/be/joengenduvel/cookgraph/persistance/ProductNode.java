package be.joengenduvel.cookgraph.persistance;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Builder
@Getter
public class ProductNode {

    @Id
    Long productId;

    String name;
}
