package be.joengenduvel.cookgraph.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication(scanBasePackages = "be.joengenduvel.cookgraph")
@EnableNeo4jRepositories(basePackages = "be.joengenduvel.cookgraph")
public class CookGraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookGraphApplication.class, args);
	}

}
