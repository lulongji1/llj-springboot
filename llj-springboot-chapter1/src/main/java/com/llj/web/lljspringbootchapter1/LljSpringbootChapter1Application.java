package com.llj.web.lljspringbootchapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LljSpringbootChapter1Application {

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(LljSpringbootChapter1Application.class, args);
    }
}
