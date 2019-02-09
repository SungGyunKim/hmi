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
	
	public List<Map<String, Object>> selectRoomcList(Map<String, Object> param) {
		return hmiRoomcMapper.selectRoomcList(param);
	}
	
	public List<Map<String, Object>> selectRoomcTempSts(Map<String, Object> param) {
		return hmiRoomcMapper.selectRoomcTempSts(param);
	}
	
	public List<Map<String, Object>> selectRoomcSts(Map<String, Object> param) {
		return hmiRoomcMapper.selectRoomcSts(param);
	}

	public List<Map<String, Object>> selectRoomc(Map<String, Object> param) {
		return hmiRoomcMapper.selectRoomc(param);
	}
}