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
	
	public List<Map<String, Object>> selectRoombList(Map<String, Object> param) {
		return hmiRoombMapper.selectRoombList(param);
	}
	
	public List<Map<String, Object>> selectRoombTempSts(Map<String, Object> param) {
		return hmiRoombMapper.selectRoombTempSts(param);
	}
	
	public List<Map<String, Object>> selectRoombSts(Map<String, Object> param) {
		return hmiRoombMapper.selectRoombSts(param);
	}

	public List<Map<String, Object>> selectRoomb(Map<String, Object> param) {
		return hmiRoombMapper.selectRoomb(param);
	}
}