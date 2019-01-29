package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiControlRecordMapper {
	
	public List<Map<String, Object>> selectControlRecordList();
	
}
