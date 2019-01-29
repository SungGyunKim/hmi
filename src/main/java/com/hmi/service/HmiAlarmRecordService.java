package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiAlarmRecordSaveRequestDto;
import com.hmi.mapper.HmiAlarmRecordMapper;
import com.hmi.repository.HmiAlarmRecordRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiAlarmRecordService {
	
	private HmiAlarmRecordRepository hmiAlarmRecordRepository;
	
	private HmiAlarmRecordMapper hmiAlarmRecordMapper;
	
	@Transactional
    public long save(HmiAlarmRecordSaveRequestDto dto){
        return hmiAlarmRecordRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param) {
		return hmiAlarmRecordMapper.selectHmiAlarmRecordList(param);
	}
	
}