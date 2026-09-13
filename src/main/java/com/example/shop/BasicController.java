package com.example.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "<h1>연습용 사이트<h1>";
    }

    @GetMapping("/htmltest")
    public String htemlTest() {
        return "index.html";
    }



}
