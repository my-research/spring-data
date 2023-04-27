package com.github.dhslrl321.todo.todo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TodoItem {

    public static TodoItem newItemOf(TodoItemId id, TodoTitle title, TodoDescription description) {
        return new TodoItem(id, title, description, TodoStatus.TODO);
    }

    private final TodoItemId id;
    private final TodoTitle title;
    private final TodoDescription description;
    private TodoStatus status;
}
