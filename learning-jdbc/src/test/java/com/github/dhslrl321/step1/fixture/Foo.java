package com.github.dhslrl321.step1.fixture;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor_= @PersistenceCreator)
public class Foo {

    public static Foo newInstance(Long id, String name) {
        return new Foo(id, name, 0);
    }

    @Id
    private final Long id;
    private final String name;
    @Version
    private long version;
}
