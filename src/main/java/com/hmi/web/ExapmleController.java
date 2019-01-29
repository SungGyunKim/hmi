package com.hmi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hmi.dto.HmiControlRecordSaveRequestDto;
import com.hmi.service.HmiControlRecordService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class ExapmleController {
	
	private HmiControlRecordService hmiRoomaService;

    @GetMapping("/layout_content_example")
    public String main() {
        return "view/layout_content_example";
    }
    
    @PutMapping("/saveControlRecord")
    public void saveControlRecord(@RequestBody HmiControlRecordSaveRequestDto dto){
    	hmiRoomaService.save(dto);
    }
    
}