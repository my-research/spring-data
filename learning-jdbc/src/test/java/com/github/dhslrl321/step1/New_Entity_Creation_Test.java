package com.github.dhslrl321.step1;

import com.github.dhslrl321.step1.fixture.Foo;
import com.github.dhslrl321.step1.fixture.FooRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 이 테스트에서는 기본적인 객체 생성과 조회 방법에 대해서 학습합니다
 *
 * @see classpath:schema/test1.sql
 */
@SpringBootTest
public class New_Entity_Creation_Test {

    @Autowired
    FooRepository sut;

    @Test
    @DisplayName("새로운 객체를 생성하고 조회할 수 있다")
    void name() {
        sut.save(Foo.newInstance(1L, "jang"));

        Foo foo = sut.findById(1L).get();

        assertThat(foo.getId()).isEqualTo(1L);
        assertThat(foo.getName()).isEqualTo("jang");
    }
}
