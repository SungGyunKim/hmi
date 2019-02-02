package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiPtMenuMapper {
	
	public List<Map<String, Object>> selectHmiPtMenuList(Map<String, Object> param);
	
	public List<Map<String, Object>> selectHmiPtMenuTreeList(Map<String, Object> param);
	
}
