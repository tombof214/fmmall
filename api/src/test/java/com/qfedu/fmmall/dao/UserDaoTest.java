package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.ApiApplication;
import com.qfedu.fmmall.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
class UserDaoTest {
    @Autowired(required = false)
    private UserDao userDao;
    @Test
    void queryUserByName() {
        User user = userDao.queryUserByName("Lucy");
        System.out.println(user);
    }
}