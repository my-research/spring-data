package com.github.dhslrl321.todo.owner;

import lombok.Value;

@Value(staticConstructor = "of")
public class OwnerId {
    long value;
}
