package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiRoomaMapper {
	
	public List<Map<String, Object>> selectHmiRoomaList(Map<String, Object> param);
	
}
