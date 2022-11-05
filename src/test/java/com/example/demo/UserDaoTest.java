package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @org.junit.jupiter.api.Test
    @DisplayName("update user")
    void update() {
        int result = userDao.insert(new User(4, "test", "test@gmail.com"));
        assertEquals(1, result);

        result = userDao.update(new User(4, "test2", "test2@gmail.com"));
        assertEquals(1, result);
    }
}