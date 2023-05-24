package be.joengenduvel.cookgraph.persistance;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends Neo4jRepository<ProductNode, Long> {
}
