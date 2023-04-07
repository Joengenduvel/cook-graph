package be.joengenduvel.cookgraph.persistance;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeNeo4jRepository extends Neo4jRepository<RecipeNode,Long>{
}
