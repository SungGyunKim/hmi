package com.hmi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.domain.HmiRoomaRepository;
import com.hmi.dto.HmiRoomaSaveRequestDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiRoomaService {
	
	private HmiRoomaRepository hmiRoomaRepository;
	
	@Transactional
    public Long save(HmiRoomaSaveRequestDto dto){
        return hmiRoomaRepository.save(dto.toEntity()).getNo();
    }
	
}