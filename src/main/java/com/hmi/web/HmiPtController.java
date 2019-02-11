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
	
	@GetMapping("/mtr/mtrRoombBatchControlPopup")
    public String mtrRoombBatchControlPopup() {
        return "view/mtr/mtrRoombBatchControlPopup";
    }
	
	@GetMapping("/mtr/mtrRoombHoInfoPopup")
    public String mtrRoombHoInfoPopup() {
        return "view/mtr/mtrRoombHoInfoPopup";
    }

	@GetMapping("/menu")
    public String menu(@RequestParam Map<String, Object> param, Model model) {
		String view = "";
		List<Map<String, Object>> menu = hmiPtMenuService.selectHmiPtMenuTreeList(param);
		
		if(menu.size() == 1) {
			view = menu.get(0).get("URL").toString();
			model.addAttribute("menu", menu.get(0));
		} else {
			// 없는 메뉴
		}
		
        return view;
    }
	
}
