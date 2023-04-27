package com.github.dhslrl321.todo;

import com.github.dhslrl321.todo.todo.TodoItem;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class TodoList {

    public static TodoList init() {
        return new TodoList(new ArrayList<>());
    }

    List<TodoItem> todoItems;
}
