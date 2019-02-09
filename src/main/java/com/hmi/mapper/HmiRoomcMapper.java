package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiRoomcMapper {
	
	public List<Map<String, Object>> selectRoomcList(Map<String, Object> param);

	public List<Map<String, Object>> selectRoomcTempSts(Map<String, Object> param);

	public List<Map<String, Object>> selectRoomcSts(Map<String, Object> param);
	
	public List<Map<String, Object>> selectRoomc(Map<String, Object> param);
}
