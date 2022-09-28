package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LogManager.getLogger("DemoApplication");

    @GetMapping("/")
    public String index(@RequestHeader(value = "User-Agent") String userAgent) {
        logger.info(userAgent + " just connected.", userAgent);
        return "Greetings from Sprintboot";
    }
}
