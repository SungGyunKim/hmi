package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.service.HmiPtMenuService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class HmiMenuController {
	
	private HmiPtMenuService hmiPtMenuService;
	
	@GetMapping("/selectHmiPtMenuList")
	public List<Map<String, Object>> selectHmiPtMenuList(@RequestParam Map<String, Object> param) {
		return hmiPtMenuService.selectHmiPtMenuList(param);
	}
	
	@GetMapping("/selectHmiPtMenuTreeList")
    public List<Map<String, Object>> selectHmiPtMenuTreeList(@RequestParam Map<String, Object> param) {
		return hmiPtMenuService.selectHmiPtMenuTreeList(param);
    }
	
}
