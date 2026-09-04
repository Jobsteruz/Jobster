package com.smartbox.jobster.config.replica;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Ring buffer of recent routing-related events: toggle changes, replica
 * health transitions (DOWN/RECOVERED), errors. Keeps the most recent
 * {@value #CAPACITY} entries for display in the admin UI.
 */
@Component
public class ReplicaRoutingEventLog {

    public enum Type { TOGGLE_ON, TOGGLE_OFF, REPLICA_DOWN, REPLICA_RECOVERED, ERROR }

    public record Event(Instant timestamp, Type type, String actor, String message) {}

    private static final int CAPACITY = 50;
    private final Deque<Event> events = new ArrayDeque<>();

    public synchronized void record(Type type, String actor, String message) {
        if (events.size() >= CAPACITY) {
            events.pollLast();
        }
        events.addFirst(new Event(Instant.now(), type, actor, message));
    }

    public synchronized List<Event> snapshot() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
