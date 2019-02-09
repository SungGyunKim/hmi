package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.service.HmiRoombService;
import com.hmi.service.HmiRoomcService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class HmiDataManagementController {
	
	private HmiRoombService hmiRoombService;
	
	private HmiRoomcService hmiRoomcService;
	
	@GetMapping("/dmt/selectRoombTempSts")
    public List<Map<String, Object>> selectRoombTempSts(@RequestParam Map<String, Object> param) {
		return hmiRoombService.selectRoombTempSts(param);
    }
	
	@GetMapping("/dmt/selectRoombList")
	public List<Map<String, Object>> selectRoombList(@RequestParam Map<String, Object> param) {
		return hmiRoombService.selectRoombList(param);
	}
	
	@GetMapping("/dmt/selectRoombSts")
	public List<Map<String, Object>> selectRoombSts(@RequestParam Map<String, Object> param) {
		return hmiRoombService.selectRoombSts(param);
	}
	
	@GetMapping("/dmt/selectRoomcTempSts")
	public List<Map<String, Object>> selectRoomcTempSts(@RequestParam Map<String, Object> param) {
		return hmiRoomcService.selectRoomcTempSts(param);
	}
	
	@GetMapping("/dmt/selectRoomcList")
	public List<Map<String, Object>> selectRoomcList(@RequestParam Map<String, Object> param) {
		return hmiRoomcService.selectRoomcList(param);
	}

	@GetMapping("/dmt/selectRoomcSts")
    public List<Map<String, Object>> selectRoomcSts(@RequestParam Map<String, Object> param) {
		return hmiRoomcService.selectRoomcSts(param);
    }
	
}