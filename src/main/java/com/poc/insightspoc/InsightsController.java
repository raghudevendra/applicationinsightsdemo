package com.poc.insightspoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsightsController {



    @GetMapping("/")
    public String hello()
    {
        return "Hello azure portal";
    }
}
