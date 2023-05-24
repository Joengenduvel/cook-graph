package be.joengenduvel.cookgraph.domain;

import lombok.Builder;

@Builder
public record Product(Long productId, String name) {

}
