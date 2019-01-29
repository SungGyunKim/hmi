package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiEnergyUseMapper {
	
	public List<Map<String, Object>> selectHmiEnergyUseList(Map<String, Object> param);
	
}
