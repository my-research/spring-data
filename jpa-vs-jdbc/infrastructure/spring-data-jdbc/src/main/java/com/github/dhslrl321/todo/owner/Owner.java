package com.github.dhslrl321.todo.owner;

import lombok.Value;

@Value(staticConstructor = "of")
public class Owner {
    OwnerId id;
    OwnerName name;
    OwnerEmail email;
}
