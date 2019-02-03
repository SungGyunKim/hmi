package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hmi.service.HmiPtMenuService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class HmiPtController {
	
	private HmiPtMenuService hmiPtMenuService;
	
	@GetMapping("/dmnt/dmntRoombList")
    public String main() {
        return "view/dmnt/dmntRoombList";
    }
	
	@GetMapping("/mtr/mtrRoomb")
    public String mtrRooma() {
        return "view/mtr/mtrRoomb";
    }
	
	@GetMapping("/mtr/mtrRoombBatchControlPopup")
    public String mtrRoombBatchControlPopup() {
        return "view/mtr/mtrRoombBatchControlPopup";
    }
	
	@GetMapping("/menu")
    public String menu(@RequestParam Map<String, Object> param, Model model) {
		List<Map<String, Object>> menuList = hmiPtMenuService.selectHmiPtMenuList(param);
		
		
		
        return "view/dmnt/dmntRoomaList";
    }
	
}
