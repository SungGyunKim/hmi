package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiControlRecordSaveRequestDto;
import com.hmi.mapper.HmiControlRecordMapper;
import com.hmi.repository.HmiControlRecordRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiControlRecordService {
	
	private HmiControlRecordRepository hmiControlRecordRepository;
	
	private HmiControlRecordMapper hmiControlRecordMapper;
	
	@Transactional
    public long save(HmiControlRecordSaveRequestDto dto){
        return hmiControlRecordRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param) {
		return hmiControlRecordMapper.selectControlRecordList(param);
	}
	
}