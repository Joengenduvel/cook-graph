package be.joengenduvel.cookgraph.domain;

import lombok.Builder;

import java.time.Duration;

@Builder
public record Recipe(long id, String title, String description, Duration duration) {
}
