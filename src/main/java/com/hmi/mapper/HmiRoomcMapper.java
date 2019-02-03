package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiRoomcMapper {
	
	public List<Map<String, Object>> selectHmiRoomList(Map<String, Object> param);

	public List<Map<String, Object>> selectRoomTempSts(Map<String, Object> param);
	
}