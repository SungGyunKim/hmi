package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.service.HmiAlarmRecordService;
import com.hmi.service.HmiControlRecordService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class HmiHistoryManagementController {

	private HmiControlRecordService hmiControlRecordService;
	private HmiAlarmRecordService hmiAlarmRecordService;
	

	@GetMapping("/htr/selectControlRecordList")
    public List<Map<String, Object>> selectControlRecordList(@RequestParam Map<String, Object> param) {
    	return hmiControlRecordService.selectControlRecordList(param);
    }

	@GetMapping("/htr/selectAlarmRecordList")
    public List<Map<String, Object>> selectAlarmRecordList(@RequestParam Map<String, Object> param) {
    	return hmiAlarmRecordService.selectAlarmRecordList(param);
    }
	
}