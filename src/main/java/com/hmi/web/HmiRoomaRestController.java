package com.hmi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.dto.HmiRoomaSaveRequestDto;
import com.hmi.service.HmiRoomaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class HmiRoomaRestController {
	
	private HmiRoomaService hmiRoomaService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    
    @PostMapping("/posts")
    public void savePosts(@RequestBody HmiRoomaSaveRequestDto dto){
    	hmiRoomaService.save(dto);
    }
    
}