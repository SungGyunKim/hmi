package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.dto.HmiControlRecordSaveRequestDto;
import com.hmi.service.HmiControlRecordService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class HmiControlRecordController {
	
	private HmiControlRecordService hmiControlRecordService;

    @PostMapping("/selectControlRecordList")
    public List<Map<String, Object>> selectControlRecordList(@RequestBody HmiControlRecordSaveRequestDto dto){
    	return hmiControlRecordService.selectControlRecordList();
    }

}