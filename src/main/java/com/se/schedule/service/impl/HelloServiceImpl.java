package com.se.schedule.service.impl;

import com.se.schedule.dao.hello.HelloDao;
import com.se.schedule.entity.Hello;
import com.se.schedule.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao mHelloDao;

    @Override
    public Hello findHelloById(long id) {
        Hello hello = mHelloDao.findById(id);
        return hello;
    }

    @Override
    public Hello findHelloByTitle(String Title) {
        Hello hello = mHelloDao.findByTitle(Title);
        return hello;
    }
}
