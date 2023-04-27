package com.github.dhslrl321.todo.todo;

import lombok.Value;

@Value(staticConstructor = "of")
public class TodoDescription {
    String value;
}
