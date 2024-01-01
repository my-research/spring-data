package com.github.dhslrl321.step1.fixture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface FooRepository extends Repository<Foo, Long> {
    void save(Foo foo);

    Optional<Foo> findById(Long id);
}
