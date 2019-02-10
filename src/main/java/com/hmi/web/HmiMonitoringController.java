package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.service.HmiControlRecordService;
import com.hmi.service.HmiRoombService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class HmiMonitoringController {
	
	private HmiRoombService hmiRoombService;
	
	private HmiControlRecordService hmiControlRecordService;
	
	@PostMapping("/mtr/mtrRoombBatchControl")
	public void mtrRoombBatchControl(@RequestParam Map<String, Object> param, @RequestParam(value="hoList[]") List<Object> hoList) {
		hmiControlRecordService.insertControlRecord(param, hoList);
	}
	
	@GetMapping("/mtr/selectRoomb")
	public List<Map<String, Object>> selectRoomb(@RequestParam Map<String, Object> param) {
		//log.debug(param.toString());
		return hmiRoombService.selectRoomb(param);
		// TODO
	}

	@PostMapping("/mtr/mtrRoomcBatchControl")
	public void mtrRoomcBatchControl(@RequestParam Map<String, Object> param, @RequestParam(value="hoList[]") List<Object> hoList) {
		log.debug(param.toString());
		log.debug(hoList.toString());
		// TODO
	}
	
	@GetMapping("/mtr/selectRoomc")
	public void selectRoomc(@RequestParam Map<String, Object> param) {
		log.debug(param.toString());
		// TODO
	}
	
}