package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiDataAnalysisSaveRequestDto;
import com.hmi.mapper.HmiDataAnalysisMapper;
import com.hmi.repository.HmiDataAnalysisRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiDataAnalysisService {
	
	private HmiDataAnalysisRepository hmiDataAnalysisRepository;
	
	private HmiDataAnalysisMapper hmiDataAnalysisMapper;
	
	@Transactional
    public long save(HmiDataAnalysisSaveRequestDto dto){
        return hmiDataAnalysisRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param) {
		return hmiDataAnalysisMapper.selectHmiDataAnalysisList(param);
	}
	
}