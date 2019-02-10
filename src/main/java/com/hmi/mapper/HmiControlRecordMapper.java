package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiControlRecordMapper {
	
	public List<Map<String, Object>> selectHmiControlRecordList(Map<String, Object> param);
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param);
	
	public void insertControlRecord(Map<String, Object> param);
	
}
