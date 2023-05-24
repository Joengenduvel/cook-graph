package be.joengenduvel.cookgraph.persistance;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
@Builder
@Getter
public class IngredientRelation {

    @RelationshipId()
    Long ingredientId;

    @TargetNode
    ProductNode product;

    int gramsQuantity;
    int mlQuantity;
    int amount;
}
