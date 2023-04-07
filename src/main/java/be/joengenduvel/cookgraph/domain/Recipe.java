package be.joengenduvel.cookgraph.domain;

import java.time.Duration;

public record Recipe(long id, String title, String description, Duration duration) {
}
