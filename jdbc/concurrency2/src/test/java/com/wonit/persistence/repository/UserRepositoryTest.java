package com.wonit.persistence.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.wonit.core.user.Infos;
import com.wonit.core.user.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void name() {
        User user = User.builder()
                .id(10L)
                .name("jang")
                .infos(Infos.of(new ArrayList<>()))
                .build();

        User save = repository.save(user);

        assertThat(save.getName()).isEqualTo(user.getName());
    }

    @Test
    void pop() throws InterruptedException {
        while (true) {
            Thread.sleep(100);
            User user = repository.findById(10L).get();
            user.pop();
            User save = repository.save(user);
            System.out.println(save);
        }
    }

    @Test
    void pop_by_second() throws InterruptedException {
        while (true) {
            int second = LocalDateTime.now().getSecond();
            if ((second / 10) % 2 != 0) {
                Thread.sleep(100);
                User user = repository.findById(10L).get();
                user.pop();
                User save = repository.save(user);
                System.out.println(save);
            }
        }
    }
}