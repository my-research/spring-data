package com.github.dhslrl321.todo;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface TodoBoardRepository extends Repository<TodoBoard, TodoBoardId> {
    void save(TodoBoard board);

    Optional<TodoBoard> findById(TodoBoardId id);
}
