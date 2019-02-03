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
		return hmiRoombService.selectRoomTempSts(param);
    }
	
	@GetMapping("/dmt/selectRoombList")
	public List<Map<String, Object>> selectHmiRoombList(@RequestParam Map<String, Object> param) {
		return hmiRoombService.selectRoomList(param);
	}
	
	@GetMapping("/dmt/selectRoomcTempSts")
	public List<Map<String, Object>> selectRoomcTempSts(@RequestParam Map<String, Object> param) {
		return hmiRoomcService.selectRoomTempSts(param);
	}
	
	@GetMapping("/dmt/selectRoomcList")
	public List<Map<String, Object>> selectHmiRoomcList(@RequestParam Map<String, Object> param) {
		return hmiRoomcService.selectRoomList(param);
	}
    
}