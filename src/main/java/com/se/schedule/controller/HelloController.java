package com.se.schedule.controller;

import com.se.schedule.dao.hello.HelloDao;
import com.se.schedule.entity.Hello;
import com.se.schedule.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/hello/")
public class HelloController {

    @Autowired
    private HelloService mHelloService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Hello getHelloById(@PathVariable long id) {
        Hello hello = mHelloService.findHelloById(id);
        return hello;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "title/{title}", method = RequestMethod.GET)
    public @ResponseBody
    Hello getHelloByTitle(@PathVariable String title) {
        Hello hello = mHelloService.findHelloByTitle(title);
        return hello;
    }
}
