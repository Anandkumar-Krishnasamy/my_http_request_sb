package com.ak.http_request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "World") String name) {
        logger.info("Received request to /hello with name: {}", name);
        return "Hello, " + name + "!";
    }
}
