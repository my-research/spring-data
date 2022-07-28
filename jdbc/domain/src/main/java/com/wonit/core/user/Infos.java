package com.wonit.core.user;

import java.util.List;
import java.util.UUID;
import lombok.Value;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public void add() {
        infos.add(Info.of(UUID.randomUUID().toString()));
    }

    public void pop() {
        if (infos.isEmpty()) {
            return;
        }
        infos.remove(0);
    }
}
