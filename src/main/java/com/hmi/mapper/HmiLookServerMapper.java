package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiLookServerMapper {
	
	public List<Map<String, Object>> selectHmiLookServerList(Map<String, Object> param);
	
}
