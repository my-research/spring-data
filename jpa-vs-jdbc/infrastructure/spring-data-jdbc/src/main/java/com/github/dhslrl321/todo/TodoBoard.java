package com.github.dhslrl321.todo;

import com.github.dhslrl321.todo.owner.Owner;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.objenesis.instantiator.ObjectInstantiator;

import java.time.LocalDateTime;
import java.util.ArrayList;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TodoBoard {

    public static TodoBoard newBoardOf(TodoBoardId id, Owner owner) {
        return new TodoBoard(id, owner, TodoList.init(), LocalDateTime.now(), LocalDateTime.now());
    }

    @Id
    TodoBoardId id;
    Owner owner;
    TodoList todoList;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;

}
