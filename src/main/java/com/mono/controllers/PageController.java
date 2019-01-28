package com.mono.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PageController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index";
    }
}
