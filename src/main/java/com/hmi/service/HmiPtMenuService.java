package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hmi.mapper.HmiPtMenuMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiPtMenuService {
	
	private HmiPtMenuMapper hmiPtMenuMapper;
	
	public List<Map<String, Object>> selectHmiPtMenuList(Map<String, Object> param) {
		return hmiPtMenuMapper.selectHmiPtMenuList(param);
	}
	
	public List<Map<String, Object>> selectHmiPtMenuTreeList(Map<String, Object> param) {
		return hmiPtMenuMapper.selectHmiPtMenuTreeList(param);
	}
	
}