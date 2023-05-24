package be.joengenduvel.cookgraph.application;

import be.joengenduvel.cookgraph.domain.Product;
import be.joengenduvel.cookgraph.persistance.ProductNode;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductNode sourceToDestination(Product product);
    Product destinationToSource(ProductNode productNode);
}
