package com.hmi.dto;

import java.sql.Timestamp;

import com.hmi.domain.HmiFactorInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HmiFactorInfoSaveRequestDto {
	
	private int fId;
	private int value;
	private String name;
	private String type;
	private String kind;
	private Timestamp regDate;
	
	public HmiFactorInfo toEntity() {
		return HmiFactorInfo.builder()
				.fId(fId)
				.value(value)
				.name(name)
				.type(type)
				.kind(kind)
				.regDate(regDate)
				.build();
	}
	
}
