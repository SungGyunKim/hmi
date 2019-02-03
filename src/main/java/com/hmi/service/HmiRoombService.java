package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiRoombSaveRequestDto;
import com.hmi.mapper.HmiRoombMapper;
import com.hmi.repository.HmiRoombRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiRoombService {
	
	private HmiRoombRepository hiRoombRepository;
	
	private HmiRoombMapper hmiRoombMapper;
	
	@Transactional
    public long save(HmiRoombSaveRequestDto dto){
        return hiRoombRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectRoomList(Map<String, Object> param) {
		return hmiRoombMapper.selectRoomList(param);
	}
	
	public List<Map<String, Object>> selectRoomTempSts(Map<String, Object> param) {
		return hmiRoombMapper.selectRoomTempSts(param);
	}
	
}