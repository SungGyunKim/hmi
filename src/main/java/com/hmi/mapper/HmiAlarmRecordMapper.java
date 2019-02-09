package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiAlarmRecordMapper {
	
	public List<Map<String, Object>> selectHmiAlarmRecordList(Map<String, Object> param);
	
	public List<Map<String, Object>> selectAlarmRecordList(Map<String, Object> param);
}
