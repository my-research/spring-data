package com.github.dhslrl321.todo;

import lombok.Value;

@Value(staticConstructor = "of")
public class TodoBoardId {
    long value;
}
