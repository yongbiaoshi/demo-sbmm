package com.my.test.sbmm.web.controller;

import com.my.test.sbmm.user.open.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {

    @Resource
    UserService userService;


    @GetMapping("/")
    public String index() {
        return userService.findById(123L);
    }

}
