package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PipelineCheckController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "Success");
        map.put("message", "Hello from CI/CD Pipeline!--- Raj");
        map.put("version", "1.0.0");
        return map;
    }
}
