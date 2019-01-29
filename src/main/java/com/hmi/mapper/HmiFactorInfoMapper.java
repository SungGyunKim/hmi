package com.hmi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HmiFactorInfoMapper {
	
	public List<Map<String, Object>> selectHmiFactorInfoList(Map<String, Object> param);
	
}
