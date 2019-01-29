package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiLookServerSaveRequestDto;
import com.hmi.mapper.HmiLookServerMapper;
import com.hmi.repository.HmiLookServerRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiLookServerService {
	
	private HmiLookServerRepository hmiLookServerRepository;
	
	private HmiLookServerMapper hmiLookServerMapper;
	
	@Transactional
    public long save(HmiLookServerSaveRequestDto dto){
        return hmiLookServerRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param) {
		return hmiLookServerMapper.selectHmiLookServerList(param);
	}
	
}