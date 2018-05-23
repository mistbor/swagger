package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 　@Description:
 * 　@author miaoying
 * 　@date 2018/5/23
 */
@Controller
public class IndexController {

    @PostMapping(value = {"/news"})
    public String news() {
        return "news";
    }

    @GetMapping(value = "test")
    @ResponseBody
    public String test(@RequestParam("t") String t) {
        return t;
    }
}
