package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiRoombMapper {
	
	public List<Map<String, Object>> selectHmiRoombList(Map<String, Object> param);
	
}