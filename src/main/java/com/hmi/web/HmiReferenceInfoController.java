package com.hmi.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmi.service.HmiEnergyUseService;
import com.hmi.service.HmiFactorInfoService;
import com.hmi.service.HmiGoalInfoService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class HmiReferenceInfoController {

	private HmiEnergyUseService hmiEnergyUseService;
	
	private HmiGoalInfoService hmiGoalInfoService;
	
	private HmiFactorInfoService hmiFactorInfoService;

	@GetMapping("/rfi/selectEnergyUseList")
    public List<Map<String, Object>> selectEnergyUseList(@RequestParam Map<String, Object> param) {
    	return hmiEnergyUseService.selectEnergyUseList(param);
    }
	
	@PostMapping("/rfi/saveEnergyUseList")
    public void saveEnergyUseList(@RequestParam Map<String, Object> param) {
    	log.debug(param.toString());
    }

	@GetMapping("/rfi/selectGoalInfoList")
    public List<Map<String, Object>> selectGoalInfoList(@RequestParam Map<String, Object> param) {
    	return hmiGoalInfoService.selectGoalInfoList(param);
    }
	
	@GetMapping("/rfi/selectFactorInfoList")
    public List<Map<String, Object>> selectFactorInfoList(@RequestParam Map<String, Object> param) {
    	return hmiFactorInfoService.selectFactorInfoList(param);
    }
	
}