package com.spring.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.spring.springboot.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query
            ("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = (:username)")
    User findByName (String username);
}
