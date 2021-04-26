package com.example.demohelloworld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class helloWorld {

    @RequestMapping("/")
    public String index()
    {
        return "start";
    }
}
