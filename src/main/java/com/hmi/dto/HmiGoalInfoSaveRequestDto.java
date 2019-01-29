package com.hmi.dto;

import java.sql.Timestamp;

import com.hmi.domain.HmiGoalInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiGoalInfoSaveRequestDto {
	
	private int gId;
	private String name;
	private String unit;
	private int value;
	private Timestamp regDate;
	
	public HmiGoalInfo toEntity() {
		return HmiGoalInfo.builder()
				.gId(gId)
				.name(name)
				.unit(unit)
				.value(value)
				.regDate(regDate)
				.build();
	}
	
}
