package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiRoomcSaveRequestDto;
import com.hmi.mapper.HmiRoomcMapper;
import com.hmi.repository.HmiRoomcRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiRoomcService {
	
	private HmiRoomcRepository hiRoomcRepository;
	
	private HmiRoomcMapper hmiRoomcMapper;
	
	@Transactional
    public long save(HmiRoomcSaveRequestDto dto){
        return hiRoomcRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectHmiRoomList(Map<String, Object> param) {
		return hmiRoomcMapper.selectHmiRoomList(param);
	}
	
	public List<Map<String, Object>> selectRoomTempSts(Map<String, Object> param) {
		return hmiRoomcMapper.selectRoomTempSts(param);
	}
	
}