package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiRoomaSaveRequestDto;
import com.hmi.mapper.HmiRoomaMapper;
import com.hmi.repository.HmiRoomaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiRoomaService {
	
	private HmiRoomaRepository hiRoomaRepository;
	
	private HmiRoomaMapper hmiRoomaMapper;
	
	@Transactional
    public long save(HmiRoomaSaveRequestDto dto){
        return hiRoomaRepository.save(dto.toEntity()).getNo();
    }
	
	public List<Map<String, Object>> selectControlRecordList(Map<String, Object> param) {
		return hmiRoomaMapper.selectHmiRoomaList(param);
	}
	
}