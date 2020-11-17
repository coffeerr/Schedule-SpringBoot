package com.se.schedule.service;

import com.se.schedule.entity.Hello;

public interface HelloService {

    Hello findHelloById(long id);
    Hello findHelloByTitle(String title);
}
