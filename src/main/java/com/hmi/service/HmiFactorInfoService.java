package com.hmi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmi.dto.HmiFactorInfoSaveRequestDto;
import com.hmi.mapper.HmiFactorInfoMapper;
import com.hmi.repository.HmiFactorInfoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HmiFactorInfoService {
	
	private HmiFactorInfoRepository hmiFactorInfoRepository;
	
	private HmiFactorInfoMapper hmiFactorInfoMapper;
	
	@Transactional
    public long save(HmiFactorInfoSaveRequestDto dto){
        return hmiFactorInfoRepository.save(dto.toEntity()).getFId();
    }
	
	public List<Map<String, Object>> selectFactorInfoList(Map<String, Object> param) {
		return hmiFactorInfoMapper.selectFactorInfoList(param);
	}
	
	@Transactional
	public void saveFactorInfo(Map<String, Object> param) {
		//String crud = param.get("oper").toString();
		//if(crud.equals("edit")){
			//hmiGoalInfoMapper.updateFactorInfoparam);
		//}else {
		hmiFactorInfoMapper.insertFactorInfo(param);
		//}
	}
	
}