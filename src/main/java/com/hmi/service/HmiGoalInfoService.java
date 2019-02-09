package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiGoalInfoSaveRequestDto;
import com.hmi.mapper.HmiGoalInfoMapper;
import com.hmi.repository.HmiGoalInfoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiGoalInfoService {
	
	private HmiGoalInfoRepository hmiGoalInfoRepository;
	
	private HmiGoalInfoMapper hmiGoalInfoMapper;
	
	@Transactional
    public long save(HmiGoalInfoSaveRequestDto dto){
        return hmiGoalInfoRepository.save(dto.toEntity()).getGId();
    }
	
	public List<Map<String, Object>> selectGoalInfoList(Map<String, Object> param) {
		return hmiGoalInfoMapper.selectGoalInfoList(param);
	}
	
}