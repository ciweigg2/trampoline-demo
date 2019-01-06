package com.example.trampolinedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class TrampolineDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrampolineDemoApplication.class, args);
    }

    @RequestMapping("/trampoline")
    public String walle(){
        log.info("测试日志的");
        return "build trampoline success3";
    }

}

