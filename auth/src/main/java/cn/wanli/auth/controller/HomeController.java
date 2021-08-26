package cn.wanli.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public String home() {
        return "welcome to experi project, this is auth app";
    }

    @GetMapping("/home")
    public String asd() {
        return "this is home api";
    }
}
