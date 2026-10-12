package com.shopflow.catalog.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping
    public Map<String, String> hello(
            @RequestParam(defaultValue = "world") String name) {
        return Map.of("message", "Hello, " + name + "!", "service", "catalog-service");
    }

    @GetMapping("/{name}")
    public Map<String, String> helloPath(@PathVariable String name) {
        return Map.of("message", "Hello, " + name + "!", "service", "catalog-service");
    }
}
