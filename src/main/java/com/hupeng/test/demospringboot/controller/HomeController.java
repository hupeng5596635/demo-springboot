package com.hupeng.test.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo-springboot
 * @description: home
 * @author: hupeng
 * @created: 2022/11/30 21:51
 */
@RestController
public class HomeController {

    @GetMapping("/home")
    public String hellSpringboot() {
        return "hello springboot test";
    }
}
