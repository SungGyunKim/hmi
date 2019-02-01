package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.service.HmiRoomaService;
import com.hmi.service.HmiRoombService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class HmiDataManagementController {
	
	private HmiRoomaService hmiRoomaService;
	
	private HmiRoombService hmiRoombService;
	
	@GetMapping("/dmt/selectRoomTempSts")
    public List<Map<String, Object>> dmntRoomList(@RequestParam Map<String, Object> param) {
		List<Map<String, Object>> list = null;
		
		if("roomB".equals(param.get("room"))) {
			list = hmiRoomaService.selectRoomTempSts(param);
		} else if("roomC".equals(param.get("room"))) {
			list = hmiRoombService.selectRoomTempSts(param);
		}
		
		return list;
    }
    
}