package com.smartbox.jobster.trello.component;

import java.util.Optional;

public interface Parseable {

    default <T> Optional<T> parseOpt() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
