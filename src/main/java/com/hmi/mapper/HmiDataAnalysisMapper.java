package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiDataAnalysisMapper {
	
	public List<Map<String, Object>> selectHmiDataAnalysisList(Map<String, Object> param);
	
}
