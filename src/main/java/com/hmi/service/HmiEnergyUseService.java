package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiEnergyUseSaveRequestDto;
import com.hmi.mapper.HmiEnergyUseMapper;
import com.hmi.repository.HmiEnergyUseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiEnergyUseService {
	
	private HmiEnergyUseRepository hmiEnergyUseRepository;
	
	private HmiEnergyUseMapper hmiEnergyUseMapper;
	
	@Transactional
    public long save(HmiEnergyUseSaveRequestDto dto){
        return hmiEnergyUseRepository.save(dto.toEntity()).getEuId();
    }
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param) {
		return hmiEnergyUseMapper.selectHmiEnergyUseList(param);
	}
	
}