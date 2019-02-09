package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiGoalInfoMapper {
	
	public List<Map<String, Object>> selectHmiGoalInfoList(Map<String, Object> param);
	
	public List<Map<String, Object>> selectGoalInfoList(Map<String, Object> param);
	
}
