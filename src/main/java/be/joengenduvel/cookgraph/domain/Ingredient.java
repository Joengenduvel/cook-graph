package be.joengenduvel.cookgraph.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Ingredient {
    Long ingredientId;
    int gramsQuantity;
    int mlQuantity;
    int amount;
    Product product;
}
