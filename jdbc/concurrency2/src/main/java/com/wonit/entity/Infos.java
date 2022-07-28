package com.wonit.entity;

import java.util.List;
import java.util.UUID;
import lombok.Value;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public void pop() {
        if (infos.isEmpty()) {
            return;
        }
        infos.remove(0);
    }
}
