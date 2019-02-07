package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class HmiMonitoringController {
	
	@PostMapping("/mtr/mtrRoombBatchControl")
	public void mtrRoombBatchControl(@RequestParam Map<String, Object> param, @RequestParam(value="hoList[]") List<Object> hoList) {
		log.debug(param.toString());
		log.debug(hoList.toString());
		// TODO
	}
	
	@GetMapping("/mtr/selectRoomb")
	public void selectRoomb(@RequestParam Map<String, Object> param) {
		log.debug(param.toString());
		// TODO
	}

}