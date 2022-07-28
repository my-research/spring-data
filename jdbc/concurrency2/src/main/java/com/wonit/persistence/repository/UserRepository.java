package com.wonit.persistence.repository;

import com.wonit.core.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
