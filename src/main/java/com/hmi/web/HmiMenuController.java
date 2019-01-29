package com.hmi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class HmiMenuController {
	
	@GetMapping("/dmnt/dmntRoomaList")
    public String main() {
        return "view/dmnt/dmntRoomaList";
    }
	
}
