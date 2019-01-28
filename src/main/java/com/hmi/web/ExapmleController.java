package com.hmi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class ExapmleController {

    @GetMapping("/layout_content_example")
    public String main() {
        return "view/layout_content_example";
    }
    
}