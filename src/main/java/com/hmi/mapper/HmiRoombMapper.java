package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiRoombMapper {
	
	public List<Map<String, Object>> selectRoombList(Map<String, Object> param);

	public List<Map<String, Object>> selectRoombTempSts(Map<String, Object> param);
	
	public List<Map<String, Object>> selectRoombSts(Map<String, Object> param);
	
	public List<Map<String, Object>> selectRoomb(Map<String, Object> param);
	
	public List<Map<String, Object>> selectRoombAllList(Map<String, Object> param);
}
