package be.joengenduvel.cookgraph.domain;

import java.time.Duration;

public record Recipe(String title, String description, Duration duration) {
}
